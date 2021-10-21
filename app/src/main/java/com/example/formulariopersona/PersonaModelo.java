package com.example.formulariopersona;

import android.app.Activity;

import androidx.annotation.NonNull;

public class PersonaModelo
{
    private String nombre;
    private String apellido;
    private String dni;
    private String sexo;
    private Activity activity;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getDNI()
    {
        return dni;
    }

    public void setDNI(String dni)
    {
        this.dni = dni;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public Activity getActivity()
    {
        return activity;
    }

    public void setActivity(Activity activity)
    {
        this.activity = activity;
    }

    public PersonaModelo() {}

    public PersonaModelo(String n, String ap, String d, String s, Activity a)
    {
        this.nombre = n;

        this.apellido = ap;

        this.dni = d;

        this.sexo = s;

        this.activity = a;
    }

    @NonNull
    @Override
    public String toString()
    {
        return activity.getString(R.string.txt_datos_ingresados1) + " " + nombre + activity.getString(R.string.txt_datos_ingresados2) + " " + apellido + activity.getString(R.string.txt_datos_ingresados3) + " " + dni + activity.getString(R.string.txt_datos_ingresados4) + " " + sexo;
    }
}