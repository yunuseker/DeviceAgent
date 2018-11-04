package com.younuseker.device_agent.data;

/**
 * Created by yunuseker on 04.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public final class MemoryInfoModel {
    private long total;
    private long available;

    public MemoryInfoModel() {
    }

    public MemoryInfoModel(long total, long available) {
        this.total = total;
        this.available = available;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getAvailable() {
        return available;
    }

    public void setAvailable(long available) {
        this.available = available;
    }
}
