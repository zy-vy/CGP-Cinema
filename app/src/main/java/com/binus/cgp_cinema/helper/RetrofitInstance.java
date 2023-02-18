package com.binus.cgp_cinema.helper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static final String BASE_URL = "https://imdb-api.com/API/";

    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){
        if ( retrofit == null ){
            retrofit = new retrofit2.Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
