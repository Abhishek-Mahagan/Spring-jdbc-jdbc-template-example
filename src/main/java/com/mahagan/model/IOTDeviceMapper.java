package com.mahagan.model;

import com.mahagan.model.IOTDevice;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IOTDeviceMapper implements RowMapper<IOTDevice> {

    @Override
    public IOTDevice mapRow(ResultSet rs, int rowNum) throws SQLException {
        IOTDevice iotDevice = new IOTDevice();
        iotDevice.setId(rs.getInt("Id"));
        iotDevice.setDeviceName(rs.getString("deviceName"));
        iotDevice.setDeviceLocation(rs.getString("deviceLocation"));
        iotDevice.setDeviceFunction(rs.getString("deviceFunction"));
        return iotDevice;
    }
}
