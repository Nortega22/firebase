package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ingresar(View view) {
        Intent Ingresar = new Intent(MainActivity.this, MainInicio.class);
        startActivity(Ingresar);
    }

    public void Registrar(View view) {
        Intent Registrar = new Intent(MainActivity.this, MainRegistrar.class);
        startActivity(Registrar);
    }
}