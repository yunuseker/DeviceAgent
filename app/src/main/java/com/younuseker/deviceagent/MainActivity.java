package com.younuseker.deviceagent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.younuseker.device_agent.DeviceAgent;
import com.younuseker.device_agent.callback.Callback;
import com.younuseker.device_agent.data.SensorInfoModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
