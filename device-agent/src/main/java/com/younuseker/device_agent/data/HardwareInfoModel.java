package com.younuseker.device_agent.data;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public final class HardwareInfoModel {
    private String product;
    private String model;
    private String osVersion;
    private String hardware;
    private String manufacturer;
    private String device;
    private String brand;
    private String display;
    private String bootloader;
    private String board;
    private String serial;

    public HardwareInfoModel() {
    }

    public HardwareInfoModel(String product, String model, String osVersion, String hardware, String manufacturer, String device, String brand, String display, String bootloader, String board, String serial) {
        this.product = product;
        this.model = model;
        this.osVersion = osVersion;
        this.hardware = hardware;
        this.manufacturer = manufacturer;
        this.device = device;
        this.brand = brand;
        this.display = display;
        this.bootloader = bootloader;
        this.board = board;
        this.serial = serial;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getBootloader() {
        return bootloader;
    }

    public void setBootloader(String bootloader) {
        this.bootloader = bootloader;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
