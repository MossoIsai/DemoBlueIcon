package com.isaigarciamoso.demoblueicon.controllers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isaigarciamoso.demoblueicon.R;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class FragmentRestaunte extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_restaurante,container,false);
        return rootView;
    }
}
