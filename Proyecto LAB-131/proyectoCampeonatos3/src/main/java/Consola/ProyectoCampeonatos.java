/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Consola;

import Estructuras.ListaDobleCampeonato;
import Clases.Comision;
import Archivos.ArchivoListaDobleCampeonato;
import Archivos.ArchivoArrayListComision;
import Clases.Autoridad;
import Clases.Campeonato;
import Estructuras.PilaAutoridad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class ProyectoCampeonatos {

    public static void main(String[] args) {        
        
//        ArchivoListaDobleCampeonato campeonatos = new ArchivoListaDobleCampeonato("D:\\LAB-131\\TALLER INTERFACES GRAFICAS\\proyectoCampeonatos3\\src\\main\\java\\Datos\\datosCampeonatos.dat");
      
        ArchivoArrayListComision comisiones = new ArchivoArrayListComision("D:\\LAB-131\\TALLER INTERFACES GRAFICAS\\proyectoCampeonatos3\\src\\main\\java\\Datos\\datosComisiones.dat");
        ArrayList<Comision> lista = comisiones.leerArchivo();
        System.out.println(lista);
        
//comisiones.eliminarArchivo();
//        comisiones.crearArchivo();
//        
//        Comision c = new Comision();
//        
//        PilaAutoridad pa = new PilaAutoridad();
//        pa.adicionar(new Autoridad("Carlos Quispe Choque", "Presidente", 2000));
//        pa.adicionar(new Autoridad("Maria Llanque Apaza", "Vicepresidente", 2000));
//        
//        c.setNombreComision("Comite de Agua");
//        c.setPa(pa);
//        lista.add(c);
//        
////        System.out.println(lista);
//        
//        comisiones.escribirArchivo(lista);
    }
}






//        Comision c = new Comision();
//        
//        PilaAutoridad pa = new PilaAutoridad();
//        pa.adicionar(new Autoridad("Carlos Quispe Choque", "Presidente", 2000));
//        pa.adicionar(new Autoridad("Maria Llanque Apaza", "Vicepresidente", 2000));
//        
//        c.setNombreComision("Comite de Agua");
//        c.setPa(pa);
//        lista.add(c);
//        
//        c = new Comision();
//        pa = new PilaAutoridad();
//        pa.adicionar(new Autoridad("Virginia Apaza Quispe", "Presidente", 3000));
//        pa.adicionar(new Autoridad("Mauricio Copa Llanos", "Vicepresidente", 2000));
//        
//        c.setNombreComision("Comite de Deportes");
//        c.setPa(pa);
//        lista.add(c);
//        
//        comisiones.eliminarArchivo();
//        comisiones.crearArchivo();
//        comisiones.escribirArchivo(lista);
////        System.out.println(lista);