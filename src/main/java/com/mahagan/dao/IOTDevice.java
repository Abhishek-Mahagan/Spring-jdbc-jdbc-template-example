package com.mahagan.dao;

import java.util.List;

public interface IOTDevice {

    com.mahagan.model.IOTDevice getDeviceById(long id);

    List<com.mahagan.model.IOTDevice> getAllDevice();

    int deletDevice(com.mahagan.model.IOTDevice iotDevice);

    int updateDevice(com.mahagan.model.IOTDevice iotDevice);

    int createIotDevice(com.mahagan.model.IOTDevice iotDevice);


}
