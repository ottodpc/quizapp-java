package com.javaproject.quizapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl("http://192.168.1.6/quiz/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}


