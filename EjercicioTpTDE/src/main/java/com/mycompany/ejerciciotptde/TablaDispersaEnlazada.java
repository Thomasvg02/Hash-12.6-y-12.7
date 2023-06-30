/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotptde;

/**
 *
 * @author valen
 */
public class TablaDispersaEnlazada {
    int M = 97;
    static final double R = 0.618034;
    Elemento[] tabla;
    int numElementos;

    public TablaDispersaEnlazada() {
        this.tabla = new Elemento[this.M];
        for (int k = 0; k < this.M; k++) {
            this.tabla[k] = null;
        }

        this.numElementos = 0;
    }

    int dispersion(long x) {
        double t;
        int v;
        t = R * x - Math.floor(R * x); // parte decimal
        v = (int) (M * t);
        return v;
    }

    public void insertar(TipoSocio s) {
        int posicion = this.dispersion(s.getCodigo());
        Elemento nuevo = new Elemento(s);
        nuevo.sgte = this.tabla[posicion];
        this.tabla[posicion] = nuevo;
        this.numElementos++;
    }

    public Elemento buscar(int codigo) {
        Elemento p = null;
        int posicion = dispersion(codigo);

        if (this.tabla[posicion] != null) {
            p = this.tabla[posicion];
            while ((p.sgte != null) && p.socio.codigo != codigo) {
                p = p.sgte;
            }

            if (p.socio.codigo != codigo) {
                p = null;
            }
        }

        return p;
    }

    public Elemento getInicio() {
        return this.tabla[0];
    }
}
