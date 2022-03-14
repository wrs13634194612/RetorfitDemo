package com.example.httpdemotwo;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeleteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        retrieveJson();
    }

    public void retrieveJson() {
        Call<DeleteBean> call = ApiClient.getInstance("http://www.mindordz.com:8381/mindor/").getApi().deleteCart("zcz00110011");
        call.enqueue(new Callback<DeleteBean>() {
            @Override
            public void onResponse(Call<DeleteBean> call, Response<DeleteBean> response) {
                Log.e("TAG", "" + response);
            }

            @Override
            public void onFailure(Call<DeleteBean> call, Throwable t) {
                Log.e("TAG", "onFailure" + t.getMessage());
            }
        });


    }


}

