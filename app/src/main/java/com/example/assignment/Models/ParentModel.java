package com.example.assignment.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ParentModel {
    @SerializedName("title")
    String title;
    @SerializedName("data")
    List<ChildModel> mlist;

    public ParentModel(String title, List<ChildModel> mlist) {
        this.title = title;
        this.mlist = mlist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ChildModel> getMlist() {
        return mlist;
    }

    public void setMlist(List<ChildModel> mlist) {
        this.mlist = mlist;
    }
}
