package com.younuseker.device_agent.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.younuseker.device_agent.data.model.BatteryInfoModel;

/**
 * Created by yunuseker on 05.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public class PrefDataManager {
    private static PrefDataManager instance;
    private SharedPreferences preferences;
    private Gson gson;
    private final static String SHARED_PREF_KEY = "com.yunuseker.pref";
    private final static String BATTERY_KEY = "key.battery";

    public static PrefDataManager getInstance() {
        return instance;
    }

    public static void init(Context context) {
        instance = new PrefDataManager(context);
    }

    private PrefDataManager(Context context) {
        preferences = context.getSharedPreferences(SHARED_PREF_KEY, Context.MODE_PRIVATE);
        gson = new Gson();
    }

    public void saveBatteryData(BatteryInfoModel batteryInfoModel){
        preferences.edit().putString(BATTERY_KEY,gson.toJson(batteryInfoModel)).apply();
    }

    public BatteryInfoModel getBatteryData(){
        return gson.fromJson(preferences.getString(BATTERY_KEY,null),BatteryInfoModel.class);
    }
}
