package com.example.httpdemotwo;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Post post;
    private RecyclerView recyclerView;

    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            if (message.what == 100) {
                post = (Post) message.obj;
                PostAdapter postAdapter = new PostAdapter(MainActivity.this, post.getData());
                recyclerView.setAdapter(postAdapter);
            }
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        retrieveJson();

    }

    public void retrieveJson() {
        Call<Post> call = ApiClient.getInstance().getApi().getPost("minApp113988", "zcz002");
        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Log.e("TAG", "" + response);
                Post mPost = response.body();
                Message msg = new Message();
                msg.what = 100;
                msg.obj = mPost;
                mHandler.sendMessage(msg);
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.e("TAG", "onFailure" + t.getMessage());
            }
        });


    }


}

