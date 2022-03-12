package com.example.httpdemotwo;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface JSONPlaceholder {

    // * 获取当前添加的设备
    @FormUrlEncoded
    @POST("wanYe/WanyeApiEquipment_loadEquipment")
    Call<Post> getPost(@Field("userId") String userId,
                       @Field("productId") String productId
    );


}
