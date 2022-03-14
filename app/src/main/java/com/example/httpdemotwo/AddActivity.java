package com.example.httpdemotwo;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        retrieveJson();
    }

    public void retrieveJson() {
        Call<AddBean> call = ApiClient.getInstance("http://www.mindordz.com:8381/mindor/").getApi().getAddPost("minApp108881", "swt002");
        call.enqueue(new Callback<AddBean>() {
            @Override
            public void onResponse(Call<AddBean> call, Response<AddBean> response) {
                Log.e("TAG", "" + response);
            }

            @Override
            public void onFailure(Call<AddBean> call, Throwable t) {
                Log.e("TAG", "onFailure" + t.getMessage());
            }
        });


    }


}

