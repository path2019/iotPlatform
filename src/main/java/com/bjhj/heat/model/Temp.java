package com.bjhj.heat.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Temp
 */
@Entity
public class Temp {
    @Id
    private String deviceId;
    private String serviceEnvironment;
    private String serviceDevice;
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

    /**
     * @return String return the deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId the deviceId to set
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * @return String return the serviceEnvironment
     */
    public String getServiceEnvironment() {
        return serviceEnvironment;
    }

    /**
     * @param serviceEnvironment the serviceEnvironment to set
     */
    public void setServiceEnvironment(String serviceEnvironment) {
        this.serviceEnvironment = serviceEnvironment;
    }

    /**
     * @return String return the serviceDevice
     */
    public String getServiceDevice() {
        return serviceDevice;
    }

    /**
     * @param serviceDevice the serviceDevice to set
     */
    public void setServiceDevice(String serviceDevice) {
        this.serviceDevice = serviceDevice;
    }

    /**
     * @return String return the eventTime
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * @param eventTime the eventTime to set
     */
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * @return Integer return the roomTemperature
     */
    public Integer getRoomTemperature() {
        return roomTemperature;
    }

    /**
     * @param roomTemperature the roomTemperature to set
     */
    public void setRoomTemperature(Integer roomTemperature) {
        this.roomTemperature = roomTemperature;
    }

    /**
     * @return Integer return the roomHumidity
     */
    public Integer getRoomHumidity() {
        return roomHumidity;
    }

    /**
     * @param roomHumidity the roomHumidity to set
     */
    public void setRoomHumidity(Integer roomHumidity) {
        this.roomHumidity = roomHumidity;
    }

    /**
     * @return Integer return the innerTempAlarm
     */
    public Integer getInnerTempAlarm() {
        return innerTempAlarm;
    }

    /**
     * @param innerTempAlarm the innerTempAlarm to set
     */
    public void setInnerTempAlarm(Integer innerTempAlarm) {
        this.innerTempAlarm = innerTempAlarm;
    }

    /**
     * @return Integer return the extTempAlarm
     */
    public Integer getExtTempAlarm() {
        return extTempAlarm;
    }

    /**
     * @param extTempAlarm the extTempAlarm to set
     */
    public void setExtTempAlarm(Integer extTempAlarm) {
        this.extTempAlarm = extTempAlarm;
    }

    /**
     * @return Integer return the humitureAlarm
     */
    public Integer getHumitureAlarm() {
        return humitureAlarm;
    }

    /**
     * @param humitureAlarm the humitureAlarm to set
     */
    public void setHumitureAlarm(Integer humitureAlarm) {
        this.humitureAlarm = humitureAlarm;
    }

    /**
     * @return String return the imei
     */
    public String getImei() {
        return imei;
    }

    /**
     * @param imei the imei to set
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * @return Integer return the battery
     */
    public Integer getBattery() {
        return battery;
    }

    /**
     * @param battery the battery to set
     */
    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    /**
     * @return String return the iccId
     */
    public String getIccId() {
        return iccId;
    }

    /**
     * @param iccId the iccId to set
     */
    public void setIccId(String iccId) {
        this.iccId = iccId;
    }

    /**
     * @return String return the cellId
     */
    public String getCellId() {
        return cellId;
    }

    /**
     * @param cellId the cellId to set
     */
    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    @Override
    public String toString() {
        return "{"+
            "deviceId='"+getDeviceId()+"'"+
            ", serviceEnvironment='"+getServiceEnvironment()+"'"+
            ", serviceDevice='"+getServiceDevice()+"'"+
            ", eventTime='"+getEventTime()+"'"+
            ", roomTemperature='"+getRoomTemperature()+"'"+
            ", roomHumidity='"+getRoomHumidity()+"'"+
            ", innerTempAlarm='"+getInnerTempAlarm()+"'"+
            ", extTempAlarm='"+getExtTempAlarm()+"'"+
            ", humitureAlarm='"+getHumitureAlarm()+"'"+
            ", imei='"+getImei()+"'"+
            ", battery='"+getBattery()+"'"+
            ", iccId='"+getIccId()+"'"+
            ", cellId='"+getCellId()+"'"+
            "}";
    }
}