package com.example.examen_adrian_alvarez;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class TimeAdapter extends RecyclerView.Adapter<TimeViewHolder> {

    Context context;

    List<Time> Times;

    @NonNull
    @Override
    public TimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TimeViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_time, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TimeViewHolder holder, int position) {
        holder.Time.setText(Times.get(position).getTime() + " Segundos");
    }

    @Override
    public int getItemCount() {
        return Times.size();
    }
}