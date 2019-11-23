package com.example.labguia07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Respuesta extends AppCompatActivity {

    TextView txtAleatorio;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        txtAleatorio = findViewById(R.id.txtAleatorio);

        sharedPreferences = this.getSharedPreferences("ArchivoPuntaje", this.MODE_PRIVATE);

        // Extraer dato
        int NumAleatorio = sharedPreferences.getInt("NumAdivinar", 0);

        txtAleatorio.setText(Integer.toString(NumAleatorio));

        if (NumAleatorio != 0){
            txtAleatorio.setText(Integer.toString(NumAleatorio));
        }else {

        }

    }
}
