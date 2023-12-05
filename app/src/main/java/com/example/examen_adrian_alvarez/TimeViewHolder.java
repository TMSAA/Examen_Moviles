package com.example.examen_adrian_alvarez;

import static java.lang.String.valueOf;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

public class TimeViewHolder extends RecyclerView.ViewHolder {

    TextView Time;

    public TimeViewHolder(@NonNull View itemView) {
        super(itemView);
        Time = itemView.findViewById(R.id.Tiempo);
    }
}