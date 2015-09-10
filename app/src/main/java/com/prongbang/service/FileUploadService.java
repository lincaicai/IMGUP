package com.prongbang.service;

import com.prongbang.dto.Properties;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by prongbang on 9/9/2015.
 */
public interface FileUploadService {

    @Headers( "Content-Type: application/json" )
    @POST("/upload")
    void upload(@Body Properties properties, Callback<Boolean> cb);

}
