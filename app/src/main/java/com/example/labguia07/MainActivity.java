package com.example.labguia07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnjugo, btnPuntaje, btnRespuesta, btnMisDatos;
    int NumeroGuardado = 0;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnjugo = findViewById(R.id.btnJuego);
        btnPuntaje = findViewById(R.id.btnPuntaje);
        btnRespuesta = findViewById(R.id.btnRespuesta);
        btnMisDatos = findViewById(R.id.btnMisDatos);

        //Activamos los listener
        btnjugo.setOnClickListener(this);
        btnPuntaje.setOnClickListener(this);
        btnRespuesta.setOnClickListener(this);
        btnMisDatos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnJuego:
                Intent juego = new Intent(getApplicationContext(), Juego.class);
                startActivity(juego);
                break;
            case R.id.btnPuntaje:
                Intent intPuntaje=new Intent(getApplicationContext(), Puntajes.class);
                startActivity(intPuntaje);
                break;
            case R.id.btnRespuesta:
                Intent intRespuesta=new Intent(getApplicationContext(), Respuesta.class);
                startActivity(intRespuesta);
                break;
            case R.id.btnMisDatos:
                Intent intMisDatos=new Intent(getApplicationContext(), MisDatos.class);
                startActivity(intMisDatos);
                break;
        }
    }
}
