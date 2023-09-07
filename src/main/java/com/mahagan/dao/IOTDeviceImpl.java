package com.mahagan.dao;

import com.mahagan.model.IOTDeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class IOTDeviceImpl implements IOTDevice {


     JdbcTemplate jdbcTemplate;

    private final String SQL_Find_Device = "select * from iotdevice where id= ?";
    private final String SQL_Delete_Device = "delete from iotdevice where id= ?  ";
    private final String SQL_Update_Device = "update iotdevice set deviceName= ?,deviceLocation= ?,deviceFunction= ? where id= ?";
    private final String SQL_Get_All_Device = "select * from iotdevice";
    private final String SQL_INSERT_DEVICE = "insert into iotdevice(id,deviceName,deviceLocation,deviceFunction) value(?,?,?,?)";

    @Autowired
    public IOTDeviceImpl(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }



    public com.mahagan.model.IOTDevice getDeviceById(long id) {
        return (com.mahagan.model.IOTDevice) jdbcTemplate.queryForObject(SQL_Find_Device, new Object[]{id}, new IOTDeviceMapper());
    }




    public List<com.mahagan.model.IOTDevice> getAllDevice() {
        return jdbcTemplate.query(SQL_Get_All_Device, new IOTDeviceMapper());
    }

    public int deletDevice(com.mahagan.model.IOTDevice iotDevice) {
        return jdbcTemplate.update(SQL_Delete_Device, iotDevice.getId()) ;
    }


    /*

     * */
    public int updateDevice(com.mahagan.model.IOTDevice iotDevice) {
        return jdbcTemplate.update(SQL_Update_Device, iotDevice.getDeviceName(),
                iotDevice.getDeviceLocation(), iotDevice.getDeviceFunction(), iotDevice.getId()) ;
    }

    public int createIotDevice(com.mahagan.model.IOTDevice iotDevice) {
        return jdbcTemplate.update(SQL_INSERT_DEVICE, iotDevice.getId(),iotDevice.getDeviceName(),
                iotDevice.getDeviceLocation(),iotDevice.getDeviceFunction());



    }

}
