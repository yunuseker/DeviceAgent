package com.younuseker.device_agent.data.model;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public final class ApplicationInfoModel {

    private String installTime;
    private String packageName;
    private String updateTime;
    private String version;
    private String name;

    public ApplicationInfoModel() {
    }

    public ApplicationInfoModel(String installTime, String packageName, String updateTime, String version, String name) {
        this.installTime = installTime;
        this.packageName = packageName;
        this.updateTime = updateTime;
        this.version = version;
        this.name = name;
    }

    public String getInstallTime() {
        return installTime;
    }

    public void setInstallTime(String installTime) {
        this.installTime = installTime;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
