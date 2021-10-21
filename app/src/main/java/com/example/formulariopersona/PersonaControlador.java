package com.example.formulariopersona;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class PersonaControlador implements View.OnClickListener
{
    private PersonaModelo modelo;

    private PersonaVista vista;

    private Activity activity;

    public PersonaControlador(PersonaModelo m, PersonaVista v, Activity a)
    {
        this.modelo = m;

        this.vista = v;

        this.activity = a;
    }

    public Boolean validarDatos()
    {
        if(((this.modelo.getNombre() == null) || (this.modelo.getNombre().isEmpty())) || ((this.modelo.getApellido() == null) || (this.modelo.getApellido().isEmpty())) || ((this.modelo.getDNI() == null) || (this.modelo.getDNI().isEmpty())) || ((this.modelo.getSexo() == null) || (this.modelo.getSexo().isEmpty())))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view)
    {
        this.vista.cargarModelo();

        if(this.validarDatos())
        {
            Log.d("Click",  this.modelo.toString());

            Toast.makeText(activity, this.modelo.toString(), Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(activity, activity.getString(R.string.txt_error), Toast.LENGTH_LONG).show();
        }
    }
}