package com.dashapplications.offerup.data;



import com.dashapplications.offerup.data.model.Photo;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Modeling the unsplash.it API.  I ❤ retrofit.
 */
public interface UnsplashService {

    String ENDPOINT = "https://unsplash.it";

    @GET("/list")
    void getFeed(Callback<List<Photo>> callback);

}
