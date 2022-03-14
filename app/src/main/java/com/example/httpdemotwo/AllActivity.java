package com.example.httpdemotwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        retrieveJson();
    }

    public void retrieveJson() {
        Call<AllBean> call = ApiClient.getInstance("http://www.mindordz.com:8381/mindor/").getApi().getAllPost("minApp113988");
        call.enqueue(new Callback<AllBean>() {
            @Override
            public void onResponse(Call<AllBean> call, Response<AllBean> response) {
                Log.e("TAG", "" + response);
            }

            @Override
            public void onFailure(Call<AllBean> call, Throwable t) {
                Log.e("TAG", "onFailure" + t.getMessage());
            }
        });
    }


}

