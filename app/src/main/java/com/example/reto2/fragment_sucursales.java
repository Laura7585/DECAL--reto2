package com.example.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class fragment_sucursales extends Fragment {

    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;
    ImageButton button5, button6, button7, button8;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment_sucursales, container, false);
        //*********************************

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.dir1, v.getContext().getTheme());

        imagen1 = (ImageView) v.findViewById(R.id.image1_fsu);
        imagen1.setImageDrawable(drawable1);

        drawable2 = res.getDrawable(R.drawable.dir2, v.getContext().getTheme());
        imagen2 = (ImageView) v.findViewById(R.id.image2_fsu);
        imagen2.setImageDrawable(drawable2);

        drawable3 = res.getDrawable(R.drawable.dir3, v.getContext().getTheme());
        imagen3 = (ImageView) v.findViewById(R.id.image3_fsu);
        imagen3.setImageDrawable(drawable3);

        drawable4 = res.getDrawable(R.drawable.dir4, v.getContext().getTheme());
        imagen4 = (ImageView) v.findViewById(R.id.image4_fsu);
        imagen4.setImageDrawable(drawable4);

        button5 = (ImageButton) v.findViewById(R.id.imageB1_fsu);
        button6 = (ImageButton) v.findViewById(R.id.imageB2_fsu);
        button7 = (ImageButton) v.findViewById(R.id.imageB3_fsu);
        button8 = (ImageButton) v.findViewById(R.id.imageB4_fsu);


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se dirige a google maps", Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se dirige a google maps", Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se dirige a google maps", Toast.LENGTH_SHORT).show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se dirige a google maps", Toast.LENGTH_SHORT).show();
            }
        });
        //*********************************
        return v;
    }
}