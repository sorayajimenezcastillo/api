package com.speedtest.api.model;

import java.util.Date;

public class SpeedTestResult {
    private String user;
    private int device;
    private Date timeStamp;
    private SpeedTestData data;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getDevice() {
        return device;
    }

    public void setDevice(int device) {
        this.device = device;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public SpeedTestData getData() {
        return data;
    }

    public void setData(SpeedTestData data) {
        this.data = data;
    }
}
