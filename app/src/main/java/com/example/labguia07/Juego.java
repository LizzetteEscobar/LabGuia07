package com.example.labguia07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Juego extends AppCompatActivity implements View.OnClickListener{

    TextView lblIntentos, lblmensaje;
    Button btnProbarSuerte,btnReiniciar;
    EditText txtNumeroElegido;
    int Aleatorio;
    int intentos = 0;
    int puntos = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        lblIntentos = findViewById(R.id.lblIntentos);
        lblmensaje = findViewById(R.id.lblmensaje);
        txtNumeroElegido = findViewById(R.id.txtNumeroElegido);
        btnProbarSuerte = findViewById(R.id.btnProbarSuerte);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        btnReiniciar.setEnabled(false);
        Aleatorio=generarAleatorio();
        btnProbarSuerte.setOnClickListener(this);
        btnReiniciar.setOnClickListener(this);
    }

    private int generarAleatorio(){ return (int)(Math.random()*10+1);   }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnProbarSuerte:
                int num = Integer.parseInt(txtNumeroElegido.getText().toString());
                if(num==Aleatorio){
                    intentos=intentos+1;
                    puntos=puntos+10;
                    txtNumeroElegido.setText("");
                    lblmensaje.setText("Felicidades, ganaste ;D tu puntuacione es: "+ puntos);
                    lblIntentos.setText("Tus intentos realizados fueron: "+ intentos);
                    btnProbarSuerte.setEnabled(false);
                    btnReiniciar.setEnabled(true);
                }else{
                    puntos=puntos-1;
                    Toast.makeText(getApplicationContext(),"Sorry... Intenta de nuevo :C", Toast.LENGTH_LONG).show();
                    intentos=intentos+1;
                    txtNumeroElegido.setText("");
                }
                break;
            case R.id.btnReiniciar:
                Aleatorio=generarAleatorio();
                btnReiniciar.setEnabled(false);
                btnProbarSuerte.setEnabled(true);
                intentos=0;
                puntos=10;
                lblmensaje.setText("Puntos: ");
                lblIntentos.setText("Intentos: ");
                break;
        }
    }
}
