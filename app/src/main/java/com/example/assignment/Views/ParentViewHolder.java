package com.example.assignment.Views;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

public class ParentViewHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    TextView textView;
    public ParentViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.rv_child);
        textView = itemView.findViewById(R.id.title);
    }
}
