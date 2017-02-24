package com.isaigarciamoso.demoblueicon.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.isaigarciamoso.demoblueicon.R;
import com.isaigarciamoso.demoblueicon.controllers.FragmentMessage;
import com.isaigarciamoso.demoblueicon.models.Message;

import java.util.List;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class AdapterMessage extends ArrayAdapter<Message> {

    public AdapterMessage(Context context, List<Message> messageList) {
        super(context, 0, messageList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View listViewInflate = convertView;
        if (convertView == null) {
            listViewInflate = inflater.inflate(R.layout.item_mensajes, parent, false);
        }
        TextView user = (TextView)listViewInflate.findViewById(R.id.twitter);
        TextView respondio = (TextView)listViewInflate.findViewById(R.id.respondio);
        TextView bardemar = (TextView)listViewInflate.findViewById(R.id.bardemar);
        TextView tiempo = (TextView)listViewInflate.findViewById(R.id.time);

         Message  item = getItem(position);
         user.setText(item.getUsuario());
         respondio.setText(item.getMensaje());
         bardemar.setText(item.getPublicacion());
         tiempo.setText(item.getTiempo());

     return listViewInflate;
    }
}
