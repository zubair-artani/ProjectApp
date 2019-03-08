package com.example.projectapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView date,name;
    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.dot);
        date = itemView.findViewById(R.id.date);
        name = itemView.findViewById(R.id.text);
    }
}
