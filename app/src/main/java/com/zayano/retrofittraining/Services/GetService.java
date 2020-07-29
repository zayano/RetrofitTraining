package com.zayano.retrofittraining.Services;

import com.zayano.retrofittraining.Model.PhotoData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/photos")
    Call<List<PhotoData>> getAllPhotos();
}
