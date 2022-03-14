package com.example.httpdemotwo;


import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JSONPlaceholder {

    // 获取当前添加的设备
    @FormUrlEncoded
    @POST("wanYe/WanyeApiEquipment_loadEquipment")
    Call<Post> getPost(@Field("userId") String userId,
                       @Field("productId") String productId
    );

    //查询要添加的设备
    @GET("dc/loadProduct")
    Call<AddBean> getAddPost(@Query("userId") String userId, @Query("productId") String productId);

    //查询所有
    @GET("dc/loadDevices")
    Call<AllBean> getAllPost(@Query("userId") String userId);

    //删除
    @DELETE("dc/deleteDevices")
    Call<DeleteBean> deleteCart(@Query("deviceId") String deviceId);

    //更新
    @POST("dc/operateDevices")
    Call<UpdateBean> updatePost(@Body RequestBody params);


}
