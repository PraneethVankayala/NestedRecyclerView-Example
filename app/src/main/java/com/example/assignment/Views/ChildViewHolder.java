package com.example.assignment.Views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

public class ChildViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    public ChildViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.profile);
        textView = (TextView) itemView.findViewById(R.id.subtitle);
    }
}
