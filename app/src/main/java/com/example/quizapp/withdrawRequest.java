package com.example.quizapp;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class withdrawRequest {
    private String userId;
    private String emailAdress;
    private String requestedBy;

    public withdrawRequest(){

    }

    public withdrawRequest(String userId, String emailAdress, String requestedBy) {
        this.userId = userId;
        this.emailAdress = emailAdress;
        this.requestedBy = requestedBy;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @ServerTimestamp
    private Date createdAt;
}
