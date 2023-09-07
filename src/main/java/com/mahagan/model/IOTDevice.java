package com.mahagan.model;

import java.util.Objects;

public class IOTDevice {
    private int Id;
    private String deviceName;
    private String deviceLocation;
    private String deviceFunction;

    public long getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getDeviceFunction() {
        return deviceFunction;
    }

    public void setDeviceFunction(String deviceFunction) {
        this.deviceFunction = deviceFunction;
    }

    public IOTDevice(int id, String deviceName, String deviceLocation, String deviceFunction) {
        Id = id;
        this.deviceName = deviceName;
        this.deviceLocation = deviceLocation;
        this.deviceFunction = deviceFunction;
    }

    public IOTDevice() {
    }

    @Override
    public String toString() {
        return "IOTDevice{" +
                "Id=" + Id +
                ", deviceName='" + deviceName + '\'' +
                ", deviceLocation='" + deviceLocation + '\'' +
                ", deviceFunction='" + deviceFunction + '\'' +
                '}';
    }
}
