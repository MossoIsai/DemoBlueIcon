package com.isaigarciamoso.demoblueicon.controllers;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.isaigarciamoso.demoblueicon.R;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class DetalleUsuario extends AppCompatActivity {
    private Button cancelar;
    private Button listo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_usuario_layout);

        initViews();
    }


    public void initViews(){
        listo = (Button)findViewById(R.id.listo);
        cancelar = (Button)findViewById(R.id.cancelar);

        listo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //Listo
                messageDialog("Cambios guardados","Información actulizada correctamente.","Aceptar");

            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cancelar
                Intent intent = new Intent(getApplicationContext(),Perfil.class);
                startActivity(intent);
                finish();
            }
        });
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
}
