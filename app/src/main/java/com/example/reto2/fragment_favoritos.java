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

public class fragment_favoritos extends Fragment {

    Drawable drawable1;
    ImageView imagen1;
    Button button1, button2;
    ImageButton imageButton1;

    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment_favoritos, container, false);
        //*********************************
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.chaq1, v.getContext().getTheme());

        imagen1 = (ImageView) v.findViewById(R.id.image1_fav);
        imagen1.setImageDrawable(drawable1);

        button1 = (Button) v.findViewById(R.id.buttonComprar_fav);
        button2 = (Button) v.findViewById(R.id.button_info_fav);
        imageButton1 = (ImageButton) v.findViewById(R.id.imageButton_cora_fav);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se compra el producto 1", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se abren los detalles del producto", Toast.LENGTH_SHORT).show();
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se elimina de favoritos", Toast.LENGTH_SHORT).show();
            }
        });

        //*********************************
        return v;
    }
}