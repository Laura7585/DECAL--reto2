package com.example.reto2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Laura Garcia
 * MainActivity
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Atributos de la clase
     */
    Fragment subPantalla1, subPantalla2, subPantalla3, subPantalla4, subPantallaInicio, subPantalla5;
    FragmentTransaction intercambio;
    Button button1, button2;
    /**
     *Método sobre escrito de la clase AppCompatActivity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subPantalla1 = new fragment_productos();
        subPantalla2 = new fragment_servicios();
        subPantalla3 = new fragment_sucursales();
        subPantalla4 = new fragment_favoritos();
        subPantalla5 = new fragment_buscar();
        subPantallaInicio = new fragment_inicio();

        //Permite poner una pantalla en el fragment
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragments, subPantallaInicio).commit();

    }

    /**
     *Método sobre escrito de la clase AppCompatActivity que incializa el menú de opciones
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater infalter = getMenuInflater();
        infalter.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    /**
     *Método sobre escrito de la clase AppCompatActivity que escucha las acciones del menú
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menuProductos){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla1).commit();
        }
        if(id==R.id.menuServicios){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla2).commit();
        }
        if(id==R.id.menuSucursales){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla3).commit();
        }
        if(id==R.id.menuFavoritos){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla4).commit();
        }
        if(id==R.id.menuBuscar){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla5).commit();
        }
        return super.onOptionsItemSelected(item);
    }

}