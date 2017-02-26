package com.isaigarciamoso.demoblueicon.controllers;

import android.content.Context;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isaigarciamoso.demoblueicon.R;

public class MainActivity extends AppCompatActivity {
   private TabLayout tabLayout;
   private ViewPager viewPager;
   private int resourcesIcons[] = {R.drawable.cora,
           R.drawable.user_detail,
           R.drawable.ic_lock};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }


    public void initViews(){
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        TabItem tabItem = new TabItem(getApplicationContext());
        viewPager = (ViewPager) findViewById(R.id.viewPager2);
        viewPager.setAdapter( new CostumAdapter(getSupportFragmentManager(),getApplicationContext()));
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
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
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(resourcesIcons[0]);
       // tabLayout.getTabAt(1).setIcon(resourcesIcons[1]);
        //tabLayout.getTabAt(2).setIcon(resourcesIcons[2]);
    }

    private class CostumAdapter extends FragmentPagerAdapter {
        public CostumAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);

        }

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentRestaunte();

            }
            return null;
        }



    }
}
