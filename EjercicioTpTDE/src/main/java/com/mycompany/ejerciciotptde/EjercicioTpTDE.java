/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciotptde;

/**
 *
 * @author valen
 */

public class EjercicioTpTDE {

    public static void main(String[] args) {
        TablaDispersaEnlazada TDE = new TablaDispersaEnlazada();

        TipoSocio socio1 = new TipoSocio("Javier", 001, 52, 28, 9, 1992);
        TipoSocio socio2 = new TipoSocio("Noelia", 032, 33, 05, 11, 2002);
        TipoSocio socio3 = new TipoSocio("Rodrigo", 942, 41, 21, 4, 2012);
        TipoSocio socio4 = new TipoSocio("Valentin", 999, 21, 5, 2, 2023);
        
        TDE.insertar(socio1);
        TDE.insertar(socio2);
        TDE.insertar(socio3);
        TDE.insertar(socio4);
        
        for (int i = 0; i < TDE.M; i++) {
            Elemento actual = TDE.tabla[i];
            while (actual != null) {
                TipoSocio socio = actual.getSocio();
                System.out.println("Posición " + "(" + i + ")" + ":");
                System.out.println("Código: " + socio.getCodigo());
                System.out.println("Nombre: " + socio.getNombre());
                System.out.println("Edad: " + socio.getEdad());
                System.out.println("Fecha de registro: " + socio.getFechaRegistro());
                actual = actual.sgte;
                if (actual == null) {
                    System.out.println("");
                }
            }
        }
    }
}
