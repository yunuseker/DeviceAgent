package com.younuseker.device_agent.data.model;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public final class SensorInfoModel {

    private String type;
    private String vendor;
    private int version;
    private String name;

    public SensorInfoModel() {
    }

    public SensorInfoModel(String type, String vendor, int version, String name) {
        this.type = type;
        this.vendor = vendor;
        this.version = version;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
