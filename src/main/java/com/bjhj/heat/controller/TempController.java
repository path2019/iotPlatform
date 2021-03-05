package com.bjhj.heat.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;

import com.bjhj.heat.model.Temp;
import com.bjhj.heat.service.TempService;

@Controller
public class TempController {
    @Resource
    TempService tempService;

    @GetMapping(path = "/add") // Map ONLY GET REQUESTs.
    public @ResponseBody String addTemp(@RequestParam String deviceId, @RequestParam Integer roomTemperature,
            @RequestParam Integer roomHumidity, @RequestParam String serviceEnvironment,
            @RequestParam String serviceDevice, @RequestParam String eventTime, @RequestParam String imei,
            @RequestParam String iccId, @RequestParam String cellId, @RequestParam Integer innerTempAlarm,
            @RequestParam Integer extTempAlarm, @RequestParam Integer humitureAlarm, @RequestParam Integer battery) {
        Temp temp = new Temp();
        temp.setDeviceId(deviceId);
        temp.setRoomTemperature(roomTemperature);
        temp.setRoomHumidity(roomHumidity);
        temp.setBattery(battery);
        temp.setCellId(cellId);
        temp.setEventTime(eventTime);
        temp.setExtTempAlarm(extTempAlarm);
        temp.setHumitureAlarm(humitureAlarm);
        temp.setIccId(iccId);
        temp.setImei(imei);
        temp.setInnerTempAlarm(innerTempAlarm);
        temp.setServiceDevice(serviceDevice);
        temp.setServiceEnvironment(serviceEnvironment);

        synchronized (this) {
            System.out.println("-------写入MySQL数据------------------------");
            tempService.save(temp);
        }
        return "Saved";
    }

    static Map<String, Temp> deviceMap = new HashMap();
    @RequestMapping("/messageReceive")
    public @ResponseBody String receiveTemp(@RequestBody String bodyStr) {

        System.out.println("---------接收到数据 " + LocalDateTime.now().toString());
        System.out.println(bodyStr);

        ObjectMapper mapper = new ObjectMapper();
        try {
            Map<String, Object> tmpMap = mapper.readValue(bodyStr, Map.class);

            String deviceId = tmpMap.get("deviceId").toString();
            String serviceId = ((Map) tmpMap.get("service")).get("serviceId").toString();
            Map data = (Map) ((Map) tmpMap.get("service")).get("data");
            String eventTime = ((Map) tmpMap.get("service")).get("eventTime").toString();

            combineData(deviceId, serviceId, data, eventTime);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "OK";
    }

    /**
     * 查询设备信息，以Json的形式输送给用户端。
     * 
     * @return
     */
    @RequestMapping("/all")
    public @ResponseBody Iterable<Temp> getAllTemps() {
        return tempService.getTempList();
    }

    @RequestMapping("/{city}")
    public @ResponseBody List<HashMap<String,HashMap<String,String>>> getTemps(@PathVariable("city") String city) {
        List<HashMap<String, HashMap<String, String>>> list = new ArrayList<HashMap<String, HashMap<String, String>>>();
        HashMap<String, String> map = readMap("./"+city+".txt");
        for (String value : map.keySet()) {
            HashMap<String, HashMap<String,String>> tempMap = new HashMap<String, HashMap<String,String>>();
            HashMap<String, String> dataMap = new HashMap<String, String>();
            Temp temp = tempService.getTemp(value);
            if (temp != null) {
                dataMap.put("温度（℃）：", String.valueOf(temp.getRoomTemperature() / 10.0));
                dataMap.put("湿度（%）：", String.valueOf(temp.getRoomHumidity()));
                dataMap.put("时间：", temp.getEventTime());
            }
            tempMap.put(map.get(value), dataMap);
            list.add(tempMap);
        }
        return list;
    }

    // 数据处理子方法
    private void combineData(String deviceId, String serviceId, Map data, String eventTime) {
        Temp temp = deviceMap.get(deviceId);
        if (temp == null) {
            temp = new Temp();
            temp.setDeviceId(deviceId);
            deviceMap.put(deviceId, temp);
        }

        if (serviceId.equals("Transmission")) {
            temp.setServiceEnvironment(serviceId);
            temp.setEventTime(eventTime);
            temp.setRoomTemperature(Integer.valueOf(data.get("room_temperature").toString()));
            temp.setRoomHumidity(Integer.valueOf(data.get("room_Humidity").toString()));
            temp.setInnerTempAlarm(Integer.valueOf(data.get("InnerTempAlarm").toString()));
            temp.setExtTempAlarm(Integer.valueOf(data.get("ExtTempAlarm").toString()));
            temp.setHumitureAlarm(Integer.valueOf(data.get("HumitureAlarm").toString()));
        }
        if (serviceId.equals("DeviceInfo")) {
            temp.setServiceDevice(serviceId);
            temp.setImei(data.get("IMEI").toString());
            temp.setBattery(Integer.valueOf(data.get("battery").toString()));
            temp.setIccId(data.get("ICCID").toString());
            temp.setCellId(data.get("cellId").toString());
        }

        if (temp.getServiceEnvironment() != null && temp.getServiceDevice() != null) {
            // 写入Excel和 MySQL
            synchronized (this) {
                try {
                    System.out.println("-------写入Excel数据------------------------");
                    System.out.println(temp);
                    ExcelHandle.writeToExcel(temp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("-------写入MySQL数据------------------------");
                tempService.save(temp);
            }
            deviceMap.remove(deviceId);
        }
    }

    // 从文件中将 deviceId 和 地名键值对读出
    private HashMap<String, String> readMap(String filePath) {
        HashMap<String, String> map = new HashMap<String, String>();
        try{
            File file = new File(filePath);
            if(file.isFile()&&file.exists())
            {
                String encoding = "UTF-8";
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                //每行文字
                String lineTxt = null;
                //每行数组
                String[] fields = null;

                while ((lineTxt = bufferedReader.readLine()) != null) {
                    fields = lineTxt.split(",");
                    map.put(fields[0], fields[1]);
                }
                read.close();
            }
            else {
                System.out.println("找不到指定的文件！");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错！");
            e.printStackTrace();
        }
        return map;
    }
}