package com.example.labguia07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Puntajes extends AppCompatActivity {

    TextView txtAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntajes);

        txtAleatorio = findViewById(R.id.txtAleatorio);

        String dato = getIntent().getStringExtra("puntos");

        txtAleatorio.setText(dato);
    }
}
