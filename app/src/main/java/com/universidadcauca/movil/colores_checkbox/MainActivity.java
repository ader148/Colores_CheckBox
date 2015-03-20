package com.universidadcauca.movil.colores_checkbox;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener  {


   //DECLARAMOS LAS VARIABLES

    CheckBox boton_amarillo, boton_azul, boton_rojo;
    ImageView color;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //RECUPERAMOS LOS VIEWS

        boton_amarillo = (CheckBox) findViewById(R.id.amarillo);
        boton_azul = (CheckBox) findViewById(R.id.azul);
        boton_rojo = (CheckBox) findViewById(R.id.rojo);
        color = (ImageView) findViewById(R.id.cuadro);


        boton_amarillo.setOnCheckedChangeListener(this);
        boton_azul.setOnCheckedChangeListener(this);
        boton_rojo.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (boton_amarillo.isChecked()==false&boton_azul.isChecked()==false&boton_rojo.isChecked()==false){

           color.setImageResource(R.drawable.blanco);
        }

        if(boton_amarillo.isChecked()& boton_azul.isChecked()== false & boton_rojo.isChecked()==false){
            color.setImageResource(R.drawable.color);


        }


        if(boton_azul.isChecked()&boton_amarillo.isChecked()==false & boton_rojo.isChecked()==false){
            color.setImageResource(R.drawable.azul); }



        if(boton_rojo.isChecked() & boton_amarillo.isChecked()==false & boton_azul.isChecked()==false){

            color.setImageResource(R.drawable.rojo);
        }

        if (boton_azul.isChecked()&boton_rojo.isChecked()&boton_amarillo.isChecked()==false){

            color.setImageResource(R.drawable.morado);
        }

        if(boton_amarillo.isChecked()&boton_azul.isChecked()&boton_rojo.isChecked()==false){

            color.setImageResource(R.drawable.verde);

        }

        if (boton_rojo.isChecked()&boton_amarillo.isChecked()&boton_azul.isChecked()==false){

            color.setImageResource(R.drawable.naranja);

        }

        if(boton_azul.isChecked()&boton_rojo.isChecked()&boton_amarillo.isChecked()){

            color.setImageResource(R.drawable.negro);
        }





    }
}




