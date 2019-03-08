package com.example.projectapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<NoteViewHolder> {
    Context context;
    ArrayList<Note> notes;

    public CustomAdapter(Context context, ArrayList<Note> notes) {
        this.context = context;
        this.notes = notes;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.note_view,viewGroup,false);
        NoteViewHolder noteViewHolder = new NoteViewHolder(view);

        return noteViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder noteViewHolder, int i) {
        Note note = notes.get(i);
        noteViewHolder.image.setImageResource(note.getImage());
        noteViewHolder.date.setText(note.getDate());
        noteViewHolder.name.setText(note.getText());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
