package com.example.httpdemotwo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.postViewHolder> {
    List<Post.DataBean> postList;
    Context context;

    public PostAdapter(Context context, List<Post.DataBean> posts) {
        this.context = context;
        postList = posts;
    }

    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item_layout, parent, false);
        return new postViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {
        holder.id.setText(postList.get(position).getButNames());
        holder.userid.setText(postList.get(position).getEquipmentId());
        holder.title.setText(postList.get(position).getEquipmentName());
        holder.body.setText(postList.get(position).getSpecificEquipmentLabel());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class postViewHolder extends RecyclerView.ViewHolder {
        TextView id, userid, title, body;

        public postViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_tv);
            userid = itemView.findViewById(R.id.user_id_tv);
            title = itemView.findViewById(R.id.title_tv);
            body = itemView.findViewById(R.id.body_tv);
        }
    }
}
