package com.kafka.consumer;

public class RiderStatus {

    private String riderName;
    private String riderStatus;

    public RiderStatus(String riderName, String riderStatus) {
        this.riderName = riderName;
        this.riderStatus = riderStatus;
    }

    public RiderStatus() {
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public String getRiderStatus() {
        return riderStatus;
    }

    public void setRiderStatus(String riderStatus) {
        this.riderStatus = riderStatus;
    }
}
