/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotptde;

/**
 *
 * @author valen
 */
public class Fecha {

    int dia;
    int mes;
    int anno;

    Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anno = a;
    }

    /* Método para devolver la fehca como una cadena de caracteres*/
    public String toString() {
        return "" + dia + "-" + mes + "-" + anno;
    }
}
