package com.bjjh.heat.model;

public class TempData {
    private String deviceId;
    private String serviceId1;
    private String serviceId2;
    private String eventTime;
    private Integer roomTemperature;
    private Integer roomHumidity;
    private Integer innerTempAlarm;
    private Integer extTempAlarm;
    private Integer humitureAlarm;
    private String imei;
    private Integer battery;
    private String iccId;
    private String cellId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getServiceId1() {
        return serviceId1;
    }

    public void setServiceId1(String serviceId1) {
        this.serviceId1 = serviceId1;
    }

    public String getServiceId2() {
        return serviceId2;
    }

    public void setServiceId2(String serviceId2) {
        this.serviceId2 = serviceId2;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public Integer getRoomTemperature() {
        return roomTemperature;
    }

    public void setRoomTemperature(Integer roomTemperature) {
        this.roomTemperature = roomTemperature;
    }

    public Integer getRoomHumidity() {
        return roomHumidity;
    }

    public void setRoomHumidity(Integer roomHumidity) {
        this.roomHumidity = roomHumidity;
    }

    public Integer getInnerTempAlarm() {
        return innerTempAlarm;
    }

    public void setInnerTempAlarm(Integer innerTempAlarm) {
        this.innerTempAlarm = innerTempAlarm;
    }

    public Integer getExtTempAlarm() {
        return extTempAlarm;
    }

    public void setExtTempAlarm(Integer extTempAlarm) {
        this.extTempAlarm = extTempAlarm;
    }

    public Integer getHumitureAlarm() {
        return humitureAlarm;
    }

    public void setHumitureAlarm(Integer humitureAlarm) {
        this.humitureAlarm = humitureAlarm;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public String getIccId() {
        return iccId;
    }

    public void setIccId(String iccId) {
        this.iccId = iccId;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }


    @Override
    public String toString() {
        return "TempData{" +
                "deviceId='" + deviceId + '\'' +
                ", serviceId1='" + serviceId1 + '\'' +
                ", serviceId2='" + serviceId2 + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", roomTemperature=" + roomTemperature +
                ", roomHumidity=" + roomHumidity +
                ", innerTempAlarm=" + innerTempAlarm +
                ", extTempAlarm=" + extTempAlarm +
                ", humitureAlarm=" + humitureAlarm +
                ", imei='" + imei + '\'' +
                ", battery=" + battery +
                ", iccId='" + iccId + '\'' +
                ", cellId='" + cellId + '\'' +
                '}';
    }
}
