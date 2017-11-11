package com.material.lineteachin3;

/**
 * Created by Admin on 17/10/2017.
 */

public class Profesor_modelo {

    private  String nombre,apellido;
    private int imgProfesor;


    public Profesor_modelo() {
    }

    public Profesor_modelo(String nombre, String apellido, int imgProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imgProfesor = imgProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getImgProfesor() {
        return imgProfesor;
    }

    public void setImgProfesor(int imgProfesor) {
        this.imgProfesor = imgProfesor;
    }
}
