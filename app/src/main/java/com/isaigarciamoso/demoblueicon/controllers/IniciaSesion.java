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
 * Created by isaigarciamoso on 23/02/17.
 */

public class IniciaSesion extends AppCompatActivity {
    private EditText usuario;
    private EditText password;
    private Button btnEntrar;
    private Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inici_session_layout);

        initViews();
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Perfil.class);
                startActivity(intent);
                finish();
            }
        });
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(),Registrar.class);
               startActivity(intent);
               finish();
            }
        });
    }
    public void initViews(){
        usuario = (EditText)findViewById(R.id.usuario);
        password = (EditText)findViewById(R.id.password);
        btnEntrar = (Button)findViewById(R.id.btnEntrar);
        registrar = (Button)findViewById(R.id.registrarAqui);



        usuario.setBackgroundResource(R.drawable.editext_style);
        password.setBackgroundResource(R.drawable.editext_style);

    }
}
