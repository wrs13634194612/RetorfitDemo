package com.example.httpdemotwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdateDeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        retrieveJson();
    }

    public void retrieveJson() {
        UpdateSendBean mUpdateSendBean = new UpdateSendBean();
        mUpdateSendBean.setEquipmentId("zcz00110011");
        mUpdateSendBean.setUserId("minApp113988");
        mUpdateSendBean.setProductId("zcz001");
        mUpdateSendBean.setEquipmentName("开关3");
        mUpdateSendBean.setEquipmentButName("按键13");
        Gson gson = new Gson();
        String jsonString = gson.toJson(mUpdateSendBean);
        RequestBody jsonData = RequestBody.create(MediaType.parse("application/json"), jsonString);
        Call<UpdateBean> call = ApiClient.getInstance("http://www.mindordz.com:8381/mindor/").getApi().updatePost(jsonData);
        call.enqueue(new Callback<UpdateBean>() {
            @Override
            public void onResponse(Call<UpdateBean> call, Response<UpdateBean> response) {
                Log.e("TAG", "" + response);
            }

            @Override
            public void onFailure(Call<UpdateBean> call, Throwable t) {
                Log.e("TAG", "onFailure" + t.getMessage());
            }
        });


    }


}


