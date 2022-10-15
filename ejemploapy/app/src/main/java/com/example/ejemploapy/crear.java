package com.example.ejemploapy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class crear extends AppCompatActivity {
    TextView nombre;
    TextView mail;
    TextView contra;
    TextView fecha;
    TextView hora;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);
        nombre=findViewById(R.id.nombre);
        mail=findViewById(R.id.mail);
        contra=findViewById(R.id.contra);
        fecha=findViewById(R.id.fecha);
        hora=findViewById(R.id.hora);
        boton=findViewById(R.id.boton);
    }
}