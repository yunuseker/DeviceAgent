package com.younuseker.deviceagent;

import android.app.Application;

import com.younuseker.device_agent.DeviceAgent;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DeviceAgent.init(this);
    }
}
