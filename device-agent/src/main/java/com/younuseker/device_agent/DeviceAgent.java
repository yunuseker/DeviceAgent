package com.younuseker.device_agent;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.younuseker.device_agent.callback.Callback;
import com.younuseker.device_agent.data.PrefDataManager;
import com.younuseker.device_agent.data.model.MemoryInfoModel;
import com.younuseker.device_agent.data.model.SensorInfoModel;

import java.util.List;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public final class DeviceAgent {
    @SuppressLint("StaticFieldLeak")
    private static DeviceAgent instance;
    private Context context;
    private DeviceManager deviceManager;

    public static DeviceAgent getInstance() {
        return instance;
    }

    public static void init(Application application) {
        if (instance == null) {
            instance = new DeviceAgent(application.getApplicationContext());
        }
    }

    private DeviceAgent(Context context) {
        this.context = context;
        PrefDataManager.init(context);
        deviceManager = new DeviceManager(context);
    }

    public List<SensorInfoModel> getSensorInfo() {
        return deviceManager.getSensorList();
    }

    public void getSensorInfoASync(final Callback<List<SensorInfoModel>> callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                callback.success(deviceManager.getSensorList());
            }
        }).start();
    }

    public MemoryInfoModel getMemoryInfo(){
        return deviceManager.getMemoryInfo(context);
    }

    public void getMemoryInfoASync(final Callback<MemoryInfoModel> callback){
        new Thread(new Runnable() {
            @Override
            public void run() {
                callback.success(deviceManager.getMemoryInfo(context));
            }
        }).start();
    }
}
