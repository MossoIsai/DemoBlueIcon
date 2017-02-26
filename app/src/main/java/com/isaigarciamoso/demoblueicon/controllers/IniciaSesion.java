package com.isaigarciamoso.demoblueicon.controllers;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.isaigarciamoso.demoblueicon.R;
import com.isaigarciamoso.demoblueicon.tools.GuiTools;

/**
 * Created by isaigarciamoso on 23/02/17.
 */

public class IniciaSesion extends AppCompatActivity {
    private EditText usuario;
    private EditText password;
    private Button btnEntrar;
    private Button registrar;
    private String userStr;
    private String passStr;
    private RelativeLayout relativeLayout;
    private TextView sincuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inici_session_layout);

        initViews();
        configurarPantalla();
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userStr = usuario.getText().toString().trim();
                passStr = password.getText().toString().trim();
                if (userStr.equals("") && passStr.equals("")) {
                    messageDialog("Campos Vacios","Es necesario llenar los campos.","Aceptar");

                } else if (userStr.equals("")) {
                    messageDialog("Campo Vacio","Es necesario ingresar un usuario.","Aceptar");


                } else if (passStr.equals("")) {
                    messageDialog("Campo Vacio","Es necesario ingresar la cotraseña.","Aceptar");


                } else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Registrar.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initViews() {
        usuario = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.password);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        registrar = (Button) findViewById(R.id.registrarAqui);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeSesion);
        sincuenta = (TextView)findViewById(R.id.sinCuenta);

        usuario.setBackgroundResource(R.drawable.editext_style);
        password.setBackgroundResource(R.drawable.editext_style);

    }
    //messageDialog
    public void messageDialog(String titulo, String mensaje, String btnNombre) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle(titulo)
                .setMessage(mensaje)
                .setPositiveButton(btnNombre, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
    private void configurarPantalla() {

        GuiTools gTools = GuiTools.getCurrent();
        gTools.init(getWindowManager());

        gTools.scale(usuario);
        gTools.scale(password);
        gTools.scale(btnEntrar);
        gTools.scale(registrar);
        gTools.scale(relativeLayout);
        gTools.scale(sincuenta,true);


    }
}
