package com.isaigarciamoso.demoblueicon.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.isaigarciamoso.demoblueicon.R;
import com.isaigarciamoso.demoblueicon.tools.GuiTools;

/**
 * Created by isaigarciamoso on 23/02/17.
 */

public class Login  extends AppCompatActivity{
    private Button btnRegistro;
    private Button btnIniciaSesion;
    private ImageView imagenSonata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        initViews();
        configurarPantalla();

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Registrar.class);
                startActivity(intent);
                finish();
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
        imagenSonata = (ImageView)findViewById(R.id.dsSonata);
    }
    private void configurarPantalla() {
        GuiTools gTools = GuiTools.getCurrent();
        gTools.init(getWindowManager());

        gTools.scale(btnIniciaSesion);
        gTools.scale(btnRegistro);
        gTools.scale(imagenSonata);


    }
}
