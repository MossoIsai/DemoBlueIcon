package com.isaigarciamoso.demoblueicon.controllers;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.isaigarciamoso.demoblueicon.R;

import jp.wasabeef.blurry.Blurry;

/**
 * Created by isaigarciamoso on 23/02/17.
 */

public class Perfil  extends AppCompatActivity{
    private ImageView imagenPerfil;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_layout);

        initViews();

    }


    public void initViews(){
        imagenPerfil = (ImageView)findViewById(R.id.perfil_img);
        tabLayout = (TabLayout)findViewById(R.id.tablayout_perfil);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter( new CostumAdapter(getSupportFragmentManager(),getApplicationContext()));

        Blurry.with(getApplicationContext())
                .radius(400)
                .sampling(1)
                .color(Color.argb(66, 0, 255, 255))
                .async()
                .capture(findViewById(R.id.perfil_img))
                .into((ImageView) findViewById(R.id.perfil_img));

      //  tabLayout.addOnTabSelectedListener();
      tabLayout.setupWithViewPager(viewPager);
      tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
          @Override
          public void onTabSelected(TabLayout.Tab tab) {
           viewPager.setCurrentItem(tab.getPosition());
          }

          @Override
          public void onTabUnselected(TabLayout.Tab tab) {
              viewPager.setCurrentItem(tab.getPosition());

          }
          @Override
          public void onTabReselected(TabLayout.Tab tab) {
              viewPager.setCurrentItem(tab.getPosition());


          }
      });


    }


    private class CostumAdapter extends FragmentPagerAdapter{
        private String fragmenTittle[] = {"FOTOS","MENSAJES","LIKES"};
        public CostumAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentFoto();

                case  1:
                    return new FragmentMessage();
                case 2:
                    return new FragmentLikes();
            }

            return  null;
        }

        @Override
        public int getCount() {
            return fragmenTittle.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmenTittle[position];
        }
    }
}
