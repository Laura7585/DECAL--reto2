package com.example.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class fragment_servicios extends Fragment {

    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment_servicios, container, false);
        //*********************************

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.domicilio, v.getContext().getTheme());

        imagen1 =(ImageView) v.findViewById(R.id.image1_fs);
        imagen1.setImageDrawable(drawable1);

        drawable2 = res.getDrawable(R.drawable.devoluciones, v.getContext().getTheme());
        imagen2 =(ImageView) v.findViewById(R.id.image2_fs);
        imagen2.setImageDrawable(drawable2);

        drawable3 = res.getDrawable(R.drawable.entrega_rapida, v.getContext().getTheme());
        imagen3 =(ImageView) v.findViewById(R.id.image3_fs);
        imagen3.setImageDrawable(drawable3);

        drawable4 = res.getDrawable(R.drawable.bono, v.getContext().getTheme());
        imagen4 =(ImageView) v.findViewById(R.id.image4_fs);
        imagen4.setImageDrawable(drawable4);
        //*********************************
        return v;
    }

}