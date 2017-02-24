package com.isaigarciamoso.demoblueicon.controllers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.isaigarciamoso.demoblueicon.Adapters.AdapterMessage;
import com.isaigarciamoso.demoblueicon.R;
import com.isaigarciamoso.demoblueicon.models.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by isaigarciamoso on 24/02/17.
 */
public class FragmentMessage extends Fragment {
    private ListView listView;
    private AdapterMessage adapterMessage;
    private List<Message> messageList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mensajes,container,false);
        listView = (ListView)rootView.findViewById(R.id.listNotificaciones);
        messageList = new ArrayList<>();

        messageList.add( new Message(" @AbraMos ","respondio a tu mensaje","Bardemar","Hace 1 Hora"));
        messageList.add( new Message(" @GrizFlor ","respondio a tu mensaje","Bardemar","Hace 2 Hora"));
        messageList.add( new Message(" @Diana ","respondio a tu mensaje","Bardemar","Hace 30 minutos"));

        adapterMessage = new AdapterMessage(this.getContext(),messageList);
        listView.setAdapter(adapterMessage);

        return  rootView;
    }
}
