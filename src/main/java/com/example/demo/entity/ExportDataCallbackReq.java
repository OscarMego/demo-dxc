package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ExportDataCallbackReq implements Serializable {
    @JsonProperty("request_id")
    private String requestId;
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("file_path")
    private String filePath;
    @JsonProperty("status_time")
    private String statusTime;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }
}
