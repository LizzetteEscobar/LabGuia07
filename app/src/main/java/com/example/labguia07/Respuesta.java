package com.example.labguia07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.example.labguia07.Juego;
import java.util.Random;

public class Respuesta extends AppCompatActivity {

    TextView txtAleatorio;
    int Aleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        txtAleatorio = findViewById(R.id.txtAleatorio);

        String dato = getIntent().getStringExtra("Aleatorio");

        txtAleatorio.setText(dato);

    }

    //private int generarAleatorio(){ return (int)(Math.random()*10+1);   }
}
