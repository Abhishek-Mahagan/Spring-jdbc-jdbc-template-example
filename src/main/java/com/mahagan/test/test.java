package com.mahagan.test;

import com.mahagan.config.config;
import com.mahagan.dao.IOTDeviceImpl;
import com.mahagan.model.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( config.class);
        com.mahagan.dao.IOTDevice iotDevice =context.getBean(com.mahagan.dao.IOTDevice.class);
        System.out.println("List of device :::::::::");

        for (IOTDevice iotDevicenew : iotDevice.getAllDevice())
        {
            System.out.println(iotDevicenew);
        }

        System.out.println("Get driver to is 1 or 2");

        //==============================================================================================

        IOTDevice deviceById= iotDevice.getDeviceById(2);
        System.out.println(deviceById);

        //=================================================================================================
        System.out.println("Creating a device is:::::::::");
        IOTDevice device=new IOTDevice(6,"Nodbus","Pune","Robotics");
        System.out.println(device);
        iotDevice.createIotDevice(device);
        System.out.println("list of person is ::");
        //==============================================================================================


        for(IOTDevice iotDevicenew : iotDevice.getAllDevice()){
            System.out.println(iotDevicenew);
        }

        //================================================================================================
        System.out.println("/Deletting device with 2 id");
        iotDevice.deletDevice(deviceById);

        //=================================================================================================
        System.out.println("/Update device with 2 id");
        IOTDevice ddevice=iotDevice.getDeviceById(6);
        ddevice.setDeviceName("IOT");
        ddevice.setDeviceFunction("Nodbus");
        ddevice.setDeviceLocation("Pune");
        iotDevice.updateDevice(ddevice);


        System.out.println("/Update device >>>>>>>>>");
        //==============================================================

        System.out.println("\n List of the Device:");
        for (IOTDevice iotDevicenew : iotDevice.getAllDevice())
        {
            System.out.println(iotDevicenew);
        }
        context.close();

    }
}
