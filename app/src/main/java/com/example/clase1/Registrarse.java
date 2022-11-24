    package com.example.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;
import com.orm.SugarRecord;

    public class Registrarse extends AppCompatActivity {

        EditText documento, nombre, correo, telefono, contrasena;
        Button registrarse, consultar;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.registrarse);

            documento = findViewById(R.id.txtDocumentoIdentidad);
            nombre = findViewById(R.id.txtNombre);
            correo = findViewById(R.id.txtCorreo);
            telefono = findViewById(R.id.txtTelefono);
            contrasena = findViewById(R.id.txtContrasena);

            registrarse = findViewById(R.id.btnRegistrarse);
            consultar = findViewById(R.id.btnConsultar);

            registrarse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String nom = nombre.getText().toString();
                    int doc = Integer.parseInt(documento.getText().toString());
                    String cor = correo.getText().toString();
                    int tel = Integer.parseInt(telefono.getText().toString());
                    int con = Integer.parseInt(contrasena.getText().toString());

                    Usuario u1 = new Usuario(doc, nom, cor, tel,con);
                    u1.save();

                    documento.setText("");
                    nombre.setText("");
                    correo.setText("");
                    telefono.setText("");
                    contrasena.setText("");


                }
            });

       consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int doc = Integer.parseInt(documento.getText().toString());

                List<Usuario> Lista = Usuario.find (Usuario.class, "documento="+doc,null);
                if (Lista.size()<=0){
                    Toast.makeText(getApplicationContext(),"usuario no existe", Toast.LENGTH_LONG).show();
                }
            } else {

                Usuario registro = Lista.get(0);
                nombre.setText(registro.getNombre());
                correo.setText(registro.getCorreo());
                telefono.setText(""+registro.getTelefono());
                contrasena.setText(""+registro.getContrasena());

            }
        });
    }

    public void Actualizar (View view){

    }

    public void Eliminar (View view){
        int doc = Integer.parseInt(documento.getText().toString());

        List<Usuario> Lista = Usuario.find (Usuario.class, "documento="+doc,null);
        Usuario registro = Lista.get(0);
        registro.delete();
    }
        }

    }