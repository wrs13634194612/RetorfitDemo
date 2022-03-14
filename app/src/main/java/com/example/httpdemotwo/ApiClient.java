package com.example.httpdemotwo;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static ApiClient apiClient;
    private static Retrofit retrofit;

    private ApiClient(String url) {

        retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static synchronized ApiClient getInstance(String url) {
        if (apiClient == null) {
            apiClient = new ApiClient(url);
        }
        return apiClient;
    }

    public JSONPlaceholder getApi() {
        return retrofit.create(JSONPlaceholder.class);
    }

}