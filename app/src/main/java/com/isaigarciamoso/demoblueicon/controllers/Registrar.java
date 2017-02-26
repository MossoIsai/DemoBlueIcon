package com.isaigarciamoso.demoblueicon.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.isaigarciamoso.demoblueicon.R;
import com.isaigarciamoso.demoblueicon.tools.GuiTools;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class Registrar extends AppCompatActivity {
    private Button goLogin;
    private EditText nombre;
    private EditText email;
    private EditText usuario;
    private EditText password;
    private Button registrar;
    private ImageView imgRegistro;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private LinearLayout linearLayout5;
    private LinearLayout linearLayout6;
    private LinearLayout linearLayout7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_login);
         initViews();
        configurarPantalla();
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
        registrar = (Button)findViewById(R.id.btnRegistro);
        imgRegistro = (ImageView)findViewById(R.id.imgSonata);

        linearLayout1 = (LinearLayout)findViewById(R.id.layout1);
        linearLayout2 = (LinearLayout)findViewById(R.id.layout2);
        linearLayout3 = (LinearLayout)findViewById(R.id.layout3);
        linearLayout4 = (LinearLayout)findViewById(R.id.layout4);
        linearLayout5 = (LinearLayout)findViewById(R.id.layout5);
        linearLayout6 = (LinearLayout)findViewById(R.id.layout6);
        linearLayout7 = (LinearLayout)findViewById(R.id.layout7);

        nombre.setBackgroundResource(R.drawable.editext_style);
        email.setBackgroundResource(R.drawable.editext_style);
        usuario.setBackgroundResource(R.drawable.editext_style);
        password.setBackgroundResource(R.drawable.editext_style);


    }
    private void configurarPantalla() {
        GuiTools gTools = GuiTools.getCurrent();
        gTools.init(getWindowManager());

        gTools.scale(goLogin);
        gTools.scale(nombre);
        gTools.scale(email);
        gTools.scale(usuario);
        gTools.scale(password);
        gTools.scale(registrar);
        gTools.scale(linearLayout1);
        gTools.scale(linearLayout2);
        gTools.scale(linearLayout3);
        gTools.scale(linearLayout4);
        gTools.scale(linearLayout5);
        gTools.scale(linearLayout6);
        gTools.scale(linearLayout7);
        gTools.scale(imgRegistro);





    }
}
