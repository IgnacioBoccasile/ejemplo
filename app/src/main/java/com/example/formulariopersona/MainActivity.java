package com.example.formulariopersona;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        PersonaModelo modelo = new PersonaModelo();

        modelo.setActivity(this);

        PersonaVista vista = new PersonaVista(modelo, this);

        PersonaControlador controlador = new PersonaControlador(modelo, vista, this);

        vista.setControlador(controlador);
    }
}