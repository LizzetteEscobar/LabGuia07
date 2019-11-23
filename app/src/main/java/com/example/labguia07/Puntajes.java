package com.example.labguia07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Puntajes extends AppCompatActivity {

    TextView txtAleatorio;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntajes);

        txtAleatorio = findViewById(R.id.txtAleatorio);

        sharedPreferences = this.getSharedPreferences("ArchivoPuntaje", this.MODE_PRIVATE);

        // Extraer dato
        int PuntajeActual = sharedPreferences.getInt("PuntajeActual", 0);

        txtAleatorio.setText(Integer.toString(PuntajeActual));
    }
}
