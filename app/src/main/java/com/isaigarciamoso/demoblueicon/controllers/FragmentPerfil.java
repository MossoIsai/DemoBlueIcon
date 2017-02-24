package com.isaigarciamoso.demoblueicon.controllers;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isaigarciamoso.demoblueicon.R;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class FragmentPerfil extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_perfil,container,false);
        return  rootView;
    }
}
