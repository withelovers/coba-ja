package com.example.smartani.Models;

import com.google.firebase.database.ServerValue;

import java.util.Map;

public class Post {

    private String postKey;
    private String title;
    private String description;
    private String picture;
    private String userId;
    private String userPhoto;
    private Map<String, String> timestamp;

    public Post (String title, String description, String picture, String userId, String userPhoto) {
        this.title = title;
        this.description = description;
        this.picture = picture;
        this.userId = userId;
        this.userPhoto = userPhoto;
        this.timestamp = ServerValue.TIMESTAMP;
    }

    public Post() {
    }

    public String getPostKey() {
        return postKey;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public Map<String, String> getTimestamp() {
        return timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }


    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }

    public void setTimestamp(Map<String, String> timestamp) {
        this.timestamp = timestamp;
    }
}
