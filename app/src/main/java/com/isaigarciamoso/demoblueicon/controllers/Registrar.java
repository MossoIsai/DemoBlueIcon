package com.isaigarciamoso.demoblueicon.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.isaigarciamoso.demoblueicon.R;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class Registrar extends AppCompatActivity {
    private Button goLogin;
    private EditText nombre;
    private EditText email;
    private EditText usuario;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_login);
         initViews();
        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),IniciaSesion.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void initViews(){

        goLogin = (Button)findViewById(R.id.goSesion);
        nombre = (EditText) findViewById(R.id.nombre);
        email = (EditText) findViewById(R.id.email);
        usuario = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.contrasena);

        nombre.setBackgroundResource(R.drawable.editext_style);
        email.setBackgroundResource(R.drawable.editext_style);
        usuario.setBackgroundResource(R.drawable.editext_style);
        password.setBackgroundResource(R.drawable.editext_style);


    }
}
