package com.example.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usuario, clave;
    Button ingresar, crearCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.txtCelularCorreo);
        clave = findViewById(R.id.txtContraseña);

        ingresar = findViewById(R.id.btnIniciarSesion);
        crearCuenta = findViewById(R.id.btnCrearCuenta);

    }

    public void IniciarSesion (View view){
        String usu = usuario.getText().toString();
        String pass = clave.getText().toString();
        if (usu.equals("jac") && pass.equals("2022")){
            Intent i = new Intent(MainActivity.this,Inicio.class);
            i.putExtra("usuario", usu);
            i.putExtra("clave",pass);

            startActivity(i);
        }

    }

    //metodo para el boton Crear Cuenta

    public void CrearCuentaNueva (View view){
        Intent CrearCuentaNueva = new Intent (this, Registrarse.class);
        startActivity(CrearCuentaNueva);
    }

}