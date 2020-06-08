package com.example.assignment.Views;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.assignment.Models.ChildModel;
import com.example.assignment.R;

import java.util.ArrayList;

public class ChildAdapter extends RecyclerView.Adapter<ChildViewHolder> {

    private Context context;
    private ArrayList<ChildModel> list;

    public ChildAdapter(Context context, ArrayList<ChildModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_recycler,parent,false);
        ChildViewHolder childViewHolder = new ChildViewHolder(v);
        return childViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {
        holder.textView.setText(list.get(position).getTitle());
        Glide.with(context).load(Uri.parse(list.get(position).getProfile())).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
