package com.example.estudiante.patronobserver;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class DialogoColor extends AppCompatDialogFragment{

    //Obsservable

    //2.Crear objeto como variable global
    MiListener listener;


    //1.cREAR interface
    interface MiListener{
        void OnChangeColor(String color);

    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Cambiar color");
        builder.setMessage("seleccionarColor");
        builder.setPositiveButton("Blanco", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.OnChangeColor("Blanco");
            }
        });
        builder.setNeutralButton("Azul", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.OnChangeColor("Azul");
            }
        });
        builder.setNegativeButton("Negro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.OnChangeColor("Negro");
            }
        });
        return  builder.create();
    }

    // 3. Metodo de set para el listener
    public void setListener(MiListener listener){
        this.listener=listener;
    }

}
