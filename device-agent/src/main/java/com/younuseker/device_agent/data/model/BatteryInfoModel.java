package com.younuseker.device_agent.data.model;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public final class BatteryInfoModel {
    private Integer scale;
    private String technology;
    private Integer level;
    private Integer voltage;
    private String status;
    private String plugged;
    private String health;
    private Integer temperature;

    public BatteryInfoModel() {
    }

    public BatteryInfoModel(Integer scale, String technology, Integer level, Integer voltage, String status, String plugged, String health, Integer temperature) {
        super();
        this.scale = scale;
        this.technology = technology;
        this.level = level;
        this.voltage = voltage;
        this.status = status;
        this.plugged = plugged;
        this.health = health;
        this.temperature = temperature;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlugged() {
        return plugged;
    }

    public void setPlugged(String plugged) {
        this.plugged = plugged;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
