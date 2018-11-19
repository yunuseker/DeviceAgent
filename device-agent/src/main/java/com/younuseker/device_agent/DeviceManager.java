package com.younuseker.device_agent;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;

import com.younuseker.device_agent.data.model.ApplicationInfoModel;
import com.younuseker.device_agent.data.model.HardwareInfoModel;
import com.younuseker.device_agent.data.model.MemoryInfoModel;
import com.younuseker.device_agent.data.model.SensorInfoModel;

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

    /**
     * app info
     */
    public List<ApplicationInfoModel> getApplicationsInfo(Context context) {
        List<ApplicationInfoModel> applicationEntityList = new ArrayList<>();
        PackageManager packageManager = context.getPackageManager();

        for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(PackageManager.GET_META_DATA)) {
            if (applicationInfo.processName != null) {
                ApplicationInfoModel applicationEntity = new ApplicationInfoModel();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.processName, 0);
                    applicationEntity.setInstallTime(String.valueOf(packageInfo.firstInstallTime));
                    applicationEntity.setUpdateTime(String.valueOf(packageInfo.lastUpdateTime));
                    applicationEntity.setPackageName(packageInfo.packageName);
                    applicationEntity.setVersion(packageInfo.versionName);
                    applicationEntity.setName(packageInfo.packageName);
                    applicationEntityList.add(applicationEntity);
                } catch (PackageManager.NameNotFoundException ignored) {

                }

            }
        }
        return applicationEntityList;
    }

    /**
     * hardware info
     */
    private static HardwareInfoModel getHardwareInfoModel() {
        HardwareInfoModel deviceEntity = new HardwareInfoModel();
        deviceEntity.setBoard(Build.BOARD);
        deviceEntity.setBrand(Build.BRAND);
        deviceEntity.setManufacturer(Build.MANUFACTURER);
        deviceEntity.setDisplay(Build.DISPLAY);
        deviceEntity.setDevice(Build.DEVICE);
        deviceEntity.setModel(Build.MODEL);
        deviceEntity.setHardware(Build.HARDWARE);
        deviceEntity.setBootloader(Build.BOOTLOADER);
        deviceEntity.setOsVersion(Build.VERSION.RELEASE);

        return deviceEntity;
    }

    /**
     * memory info
     */
    public MemoryInfoModel getMemoryInfo(Context context) {
        MemoryInfoModel memoryEntity = new MemoryInfoModel();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return memoryEntity;
        }
        activityManager.getMemoryInfo(memoryInfo);
        memoryEntity.setAvailable(memoryInfo.availMem);
        memoryEntity.setTotal(memoryInfo.totalMem);
        return memoryEntity;
    }
}
