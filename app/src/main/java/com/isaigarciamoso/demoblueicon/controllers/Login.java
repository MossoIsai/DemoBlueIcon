package com.isaigarciamoso.demoblueicon.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.isaigarciamoso.demoblueicon.R;

/**
 * Created by isaigarciamoso on 23/02/17.
 */

public class Login  extends AppCompatActivity{
    private Button btnRegistro;
    private Button btnIniciaSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        initViews();
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Enviar al Login de Iniciar Sesion
         btnIniciaSesion.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getApplicationContext(),IniciaSesion.class);
                 startActivity(intent);
                 finish();
             }
         });
    }
    public void initViews(){
        btnRegistro = (Button)findViewById(R.id.registro);
        btnIniciaSesion = (Button)findViewById(R.id.iniciSesion);
    }
}
