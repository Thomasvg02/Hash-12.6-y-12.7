/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotptde;

/**
 *
 * @author valen
 */
public class TipoSocio {
     int codigo;
    private String nombre;
    private int edad;
    Fecha f;

    public TipoSocio(String n, int c, int e, int d, int m, int a) {
        this.codigo = c;
        setNombre(n);
        setEdad(e);
        this.f = new Fecha(d, m, a);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Fecha getFechaRegistro() {
        return f;
    }

    public void setFechaRegistro(Fecha f) {
        this.f = f;
    }

}
