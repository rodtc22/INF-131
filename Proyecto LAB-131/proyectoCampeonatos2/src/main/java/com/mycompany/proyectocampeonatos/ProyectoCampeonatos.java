/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectocampeonatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class ProyectoCampeonatos {

    public static void main(String[] args) {        
        ArchivoArrayListComision comisiones = new ArchivoArrayListComision("datosComisiones.dat");
        ArchivoListaDobleCampeonato campeonatos = new ArchivoListaDobleCampeonato("datosCampeonatos.dat");
        
        ArrayList<Comision> lcomisiones = comisiones.leerArchivo();
        ListaDobleCampeonato lcampeonatos = campeonatos.leerArchivo();
        
        lcampeonatos.mostrar();
        System.out.println(lcomisiones);
    }
}
