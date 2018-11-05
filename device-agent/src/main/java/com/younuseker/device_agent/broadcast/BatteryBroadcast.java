package com.younuseker.device_agent.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

import com.younuseker.device_agent.data.PrefDataManager;
import com.younuseker.device_agent.data.model.BatteryInfoModel;

/**
 * Created by yunuseker on 05.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public class BatteryBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        BatteryInfoModel batteryInfoModel = new BatteryInfoModel();
        batteryInfoModel.setTechnology(intent.getStringExtra(BatteryManager.EXTRA_TECHNOLOGY));
        batteryInfoModel.setLevel(intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0));
        batteryInfoModel.setScale(intent.getIntExtra(BatteryManager.EXTRA_SCALE, 0));
        batteryInfoModel.setTemperature(intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0));
        batteryInfoModel.setVoltage(intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0));

        switch (intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, 1)) {
            case BatteryManager.BATTERY_PLUGGED_AC:
                batteryInfoModel.setPlugged("ac");
                break;
            case BatteryManager.BATTERY_PLUGGED_USB:
                batteryInfoModel.setPlugged("usb");
                break;
            case BatteryManager.BATTERY_PLUGGED_WIRELESS:
                batteryInfoModel.setPlugged("wireless");
                break;
        }

        switch (intent.getIntExtra(BatteryManager.EXTRA_STATUS, 1)) {
            case BatteryManager.BATTERY_STATUS_UNKNOWN:
                batteryInfoModel.setStatus("unknown");
                break;
            case BatteryManager.BATTERY_STATUS_CHARGING:
                batteryInfoModel.setStatus("charging");
                break;
            case BatteryManager.BATTERY_STATUS_DISCHARGING:
                batteryInfoModel.setStatus("discharging");
                break;
            case BatteryManager.BATTERY_STATUS_FULL:
                batteryInfoModel.setStatus("full");
                break;
            case BatteryManager.BATTERY_STATUS_NOT_CHARGING:
                batteryInfoModel.setStatus("not_charging");
                break;
            default:
                batteryInfoModel.setStatus("unknown");
                break;
        }

        switch (intent.getIntExtra(BatteryManager.EXTRA_HEALTH, 1)) {
            case BatteryManager.BATTERY_HEALTH_UNKNOWN:
                batteryInfoModel.setHealth("unknown");
                break;
            case BatteryManager.BATTERY_HEALTH_COLD:
                batteryInfoModel.setHealth("cold");
                break;
            case BatteryManager.BATTERY_HEALTH_DEAD:
                batteryInfoModel.setHealth("dead");
                break;
            case BatteryManager.BATTERY_HEALTH_GOOD:
                batteryInfoModel.setHealth("good");
                break;
            case BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE:
                batteryInfoModel.setHealth("over_voltage");
                break;
            case BatteryManager.BATTERY_HEALTH_OVERHEAT:
                batteryInfoModel.setHealth("overheat");
                break;
            case BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE:
                batteryInfoModel.setHealth("unspecified_failture");
                break;
            default:
                batteryInfoModel.setStatus("unknown");
                break;
        }
        PrefDataManager.getInstance().saveBatteryData(batteryInfoModel);
    }
}
