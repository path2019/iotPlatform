package com.bjjh.heat.contoller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.bjjh.heat.model.TempData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ReceiveTemperatureController {

    static Map<String, TempData> deviceMap = new HashMap();

    @RequestMapping("/messageReceive")
    public String receiveTemp(HttpServletRequest request, HttpServletResponse response, @RequestBody String bodyStr) {

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

    private void combineData(String deviceId, String serviceId, Map data, String eventTime) {
        TempData tempData = deviceMap.get(deviceId);
        if (tempData == null) {
            tempData = new TempData();
            tempData.setDeviceId(deviceId);
            deviceMap.put(deviceId, tempData);
        }

        if (serviceId.equals("Transmission")) {
            tempData.setServiceId1(serviceId);
            tempData.setEventTime(eventTime);
            tempData.setRoomTemperature(Integer.valueOf(data.get("room_temperature").toString()));
            tempData.setRoomHumidity(Integer.valueOf(data.get("room_Humidity").toString()));
            tempData.setInnerTempAlarm(Integer.valueOf(data.get("InnerTempAlarm").toString()));
            tempData.setExtTempAlarm(Integer.valueOf(data.get("ExtTempAlarm").toString()));
            tempData.setHumitureAlarm(Integer.valueOf(data.get("HumitureAlarm").toString()));
        }
        if (serviceId.equals("DeviceInfo")) {
            tempData.setServiceId2(serviceId);
            tempData.setImei(data.get("IMEI").toString());
            tempData.setBattery(Integer.valueOf(data.get("battery").toString()));
            tempData.setIccId(data.get("ICCID").toString());
            tempData.setCellId(data.get("cellId").toString());
        }


        if (tempData.getServiceId1() != null && tempData.getServiceId2() != null) {
            //写入Excel
            synchronized (this) {
                try {
                    System.out.println("-------写入Excel数据------------------------");
                    System.out.println(tempData);
                    ExcelHandle.writeToExcel(tempData);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            deviceMap.remove(deviceId);
        }
    }
}
