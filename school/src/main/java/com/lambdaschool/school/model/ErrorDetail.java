package com.lambdaschool.school.model;

import com.lambdaschool.school.exceptions.ValidationError;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail
{
    private String Title;
    private int status;
    private  String detail;
    private String timestamp;
    private String developermessage;
    private Map<String, List<ValidationError>> error = new HashMap<>();

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTimestamp() {
        return timestamp;
    }

//    I am Taking in the time stamp as a long and converting it into a String So I can have my own custom timestamp
//    format
    public void setTimestamp(Long timestamp) {
        this.timestamp = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS z").format(new Date(timestamp));
    }

    public String getDevelopermessage() {
        return developermessage;
    }

    public void setDevelopermessage(String developermessage) {
        this.developermessage = developermessage;
    }

    public Map<String, List<ValidationError>> getError() {
        return error;
    }

    public void setError(Map<String, List<ValidationError>> error) {
        this.error = error;
    }
}
