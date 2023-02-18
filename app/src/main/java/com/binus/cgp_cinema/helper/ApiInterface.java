package com.binus.cgp_cinema.helper;

import com.binus.cgp_cinema.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("InTheaters/{API_KEY}")
    Call<ApiResponse> getMovies(@Path("API_KEY") String api_key);

}
