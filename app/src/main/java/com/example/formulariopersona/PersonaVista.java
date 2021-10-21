package com.example.formulariopersona;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PersonaVista
{
    PersonaModelo modelo;

    Activity activity;

    PersonaControlador controlador;

    EditText editNombre;

    EditText editApellido;

    EditText editDNI;

    RadioButton radioHombre;
    RadioButton radioMujer;

    public PersonaVista(PersonaModelo m, Activity a)
    {
        this.modelo = m;

        this.activity = a;
    }

    public void setControlador(PersonaControlador c)
    {
        this.controlador = c;

        cargarElementos();
    }

    public void cargarElementos()
    {
        this.editNombre = activity.findViewById(R.id.editNombre);

        this.editApellido = activity.findViewById(R.id.editApellido);

        this.editDNI = activity.findViewById(R.id.editDNI);

        this.radioHombre = activity.findViewById(R.id.radioHombre);
        this.radioMujer = activity.findViewById(R.id.radioMujer);

        Button btn = activity.findViewById(R.id.buttonGuardar);
        btn.setOnClickListener(controlador);
    }

    public void cargarModelo()
    {
        this.modelo.setNombre(editNombre.getText().toString());

        this.modelo.setApellido(editApellido.getText().toString());

        this.modelo.setDNI(editDNI.getText().toString());

        if((radioHombre.isChecked() == true) && (radioMujer.isChecked() == false))
        {
            this.modelo.setSexo(radioHombre.getText().toString());
        }
        else if((radioHombre.isChecked() == false) && (radioMujer.isChecked() == true))
        {
            this.modelo.setSexo(radioMujer.getText().toString());
        }
    }
}
