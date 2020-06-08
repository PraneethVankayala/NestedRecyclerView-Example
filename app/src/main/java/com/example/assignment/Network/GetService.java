package com.example.assignment.Network;

import com.example.assignment.Models.ParentModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("android/v1/prod/Radio/hi/show.json")
    Call<List<ParentModel>> getAllList();
}
