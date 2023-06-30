/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotptde;

/**
 *
 * @author valen
 */
public class Elemento {
   TipoSocio socio;
    Elemento sgte;

    public Elemento(TipoSocio e) {
        this.socio = e;
        this.sgte = null;
    }

    public TipoSocio getSocio() {
        return socio;
    }
}
