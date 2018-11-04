package com.younuseker.device_agent;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;

import com.younuseker.device_agent.data.SensorInfoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
final class DeviceManager {
    private Context context;

    DeviceManager(Context context) {
        this.context = context;
    }

    /**
     * Sensor Info
     */
    public List<SensorInfoModel> getSensorList() {
        List<SensorInfoModel> sensorInfoModels = new ArrayList<>();
        SensorManager sensorManager = (SensorManager) this.context.getSystemService(Context.SENSOR_SERVICE);
        if (sensorManager == null) {
            return sensorInfoModels;
        }
        for (Sensor sensor : sensorManager.getSensorList(Sensor.TYPE_ALL)) {
            SensorInfoModel sensorModel = new SensorInfoModel();
            sensorModel.setType(sensor.getStringType());
            sensorModel.setName(sensor.getName());
            sensorModel.setVendor(sensor.getVendor());
            sensorModel.setVersion(sensor.getVersion());
            sensorInfoModels.add(sensorModel);
        }
        return sensorInfoModels;
    }
}
