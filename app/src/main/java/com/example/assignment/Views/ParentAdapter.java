package com.example.assignment.Views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.Models.ChildModel;
import com.example.assignment.Models.ParentModel;
import com.example.assignment.R;

import java.util.ArrayList;

public class ParentAdapter extends RecyclerView.Adapter<ParentViewHolder> {

    private Context context;
    private ArrayList<ParentModel> plist;

    public ParentAdapter(Context context, ArrayList<ParentModel> plist) {
        this.context = context;
        this.plist = plist;
    }

    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recycler,parent,false);
        ParentViewHolder pvh = new ParentViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, int position) {
        holder.textView.setText(plist.get(position).getTitle());
        ChildAdapter childAdapter = new ChildAdapter(context, (ArrayList<ChildModel>) plist.get(position).getMlist());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(holder.recyclerView.getContext(),RecyclerView.HORIZONTAL,false);
        layoutManager.setItemPrefetchEnabled(true);
        holder.recyclerView.setLayoutManager(layoutManager);
        holder.recyclerView.setAdapter(childAdapter);
        holder.recyclerView.setRecycledViewPool(new RecyclerView.RecycledViewPool());


    }

    @Override
    public int getItemCount() {
        return plist.size();
    }
}
