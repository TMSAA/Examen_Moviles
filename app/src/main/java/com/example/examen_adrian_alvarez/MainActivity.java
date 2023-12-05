package com.example.examen_adrian_alvarez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int num = 0;

    TextView cronometro = findViewById(R.id.Cronometro);
    private Handler autoIncrementHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        automatico();

    }

    public void contar(){// Cuando el usuario de al play se empezara a contar
        num = 1;
    }

    public void pausa(){// cuando el usuario queira pausar se seguira funcionado el bucle pero no sumara nada hasta que vulva a pulsar

        if (num == 1){
            num = 0;
        }else{
            num = 1;
        }

    }

    public void Record(){// no eh podio crea un bucle para crear los recyclervieew
        new Time(String.valueOf(num));
    }
    public void automatico(){// bucle para sumar cada segundo
        Runnable autoIncrementRunnable = new Runnable() {
            @Override
            public void run() {
                num++;
                cronometro.setText(String.valueOf(num));

                Intent updateIntent = new Intent("ACTUALIZAR_CONTADOR");
                updateIntent.putExtra("contador", num);
                sendBroadcast(updateIntent);

                autoIncrementHandler.postDelayed(this, 1000);
            }
        };
        autoIncrementHandler.postDelayed(autoIncrementRunnable, 1000);

    }
}