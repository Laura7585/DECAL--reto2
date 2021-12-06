package com.example.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class fragment_productos extends Fragment {

    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;
    Button button1, button2, button3, button4;
    ImageButton button5, button6, button7, button8;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment_productos, container, false);
        //***************************************************

        //**************CARGUE DE IMÀGENES*******************
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.chaq4, v.getContext().getTheme());

        imagen1 = (ImageView) v.findViewById(R.id.image1_fp);
        imagen1.setImageDrawable(drawable1);

        drawable2 = res.getDrawable(R.drawable.chaq3, v.getContext().getTheme());
        imagen2 = (ImageView) v.findViewById(R.id.image2_fp);
        imagen2.setImageDrawable(drawable2);

        drawable3 = res.getDrawable(R.drawable.chaq2, v.getContext().getTheme());
        imagen3 = (ImageView) v.findViewById(R.id.image3_fp);
        imagen3.setImageDrawable(drawable3);

        drawable4 = res.getDrawable(R.drawable.chaq1, v.getContext().getTheme());
        imagen4 = (ImageView) v.findViewById(R.id.image4_fp);
        imagen4.setImageDrawable(drawable4);

        button1 = (Button) v.findViewById(R.id.button1);
        button2 = (Button) v.findViewById(R.id.button2);
        button3 = (Button) v.findViewById(R.id.button3);
        button4 = (Button) v.findViewById(R.id.button4);
        button5 = (ImageButton) v.findViewById(R.id.imageButton8);
        button6 = (ImageButton) v.findViewById(R.id.imageButton9);
        button7 = (ImageButton) v.findViewById(R.id.imageButton3);
        button8 = (ImageButton) v.findViewById(R.id.imageButton4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se compra el producto 1", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se compra el producto 2", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se compra el producto 3", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se compra el producto 4", Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se agrega el producto 1 a la lista de favoritos", Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se agrega el producto 2 a la lista de favoritos", Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se agrega el producto 3 a la lista de favoritos", Toast.LENGTH_SHORT).show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se agrega el producto 4 a la lista de favoritos", Toast.LENGTH_SHORT).show();
            }
        });
        //***************************************************

        //***************************************************
        return v;
    }
}