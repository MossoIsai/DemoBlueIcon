package com.isaigarciamoso.demoblueicon.controllers;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.isaigarciamoso.demoblueicon.R;

import jp.wasabeef.blurry.Blurry;

/**
 * Created by isaigarciamoso on 23/02/17.
 */

public class Perfil  extends AppCompatActivity{
    private ImageView imagenPerfil;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_layout);

        initViews();

    }


    public void initViews(){
        imagenPerfil = (ImageView)findViewById(R.id.perfil_img);
        tabLayout = (TabLayout)findViewById(R.id.tablayout_perfil);

        Blurry.with(getApplicationContext())
                .radius(400)
                .sampling(1)
                .color(Color.argb(66, 0, 255, 255))
                .async()
                .capture(findViewById(R.id.perfil_img))
                .into((ImageView) findViewById(R.id.perfil_img));

      //  tabLayout.addOnTabSelectedListener();





    }





}
