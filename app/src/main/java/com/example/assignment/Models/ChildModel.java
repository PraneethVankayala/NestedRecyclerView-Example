package com.example.assignment.Models;

import com.google.gson.annotations.SerializedName;

public class ChildModel {
    @SerializedName("t")
    private String title;
    @SerializedName("cat")
    private String category;
    @SerializedName("d")
    private String  data;
    @SerializedName("pF")
    private String profile;

    public ChildModel(String title, String category, String data, String profile) {
        this.title = title;
        this.category = category;
        this.data = data;
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
