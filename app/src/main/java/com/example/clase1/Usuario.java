package com.example.clase1;

import com.orm.SugarRecord;

public class Usuario extends SugarRecord<Usuario> {
    private int documento;
    private String nombre;
    private String correo;
    private int telefono;
    private int contrasena;

    public Usuario(int doc, String nom, String cor, int tel) {
    }

    public Usuario(int documento, String nombre, String correo, int telefono, int contrasena) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo (String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
}
