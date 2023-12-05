package com.example.examen_adrian_alvarez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Time extends AppCompatActivity {

    String time;

    public Time(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}