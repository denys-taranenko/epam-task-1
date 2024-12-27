package com.edu;

public class Application {
    private String applicationId;
    private String status;

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
