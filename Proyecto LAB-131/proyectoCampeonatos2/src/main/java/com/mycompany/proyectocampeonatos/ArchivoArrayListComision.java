/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class ArchivoArrayListComision {
    private String ruta;

    public ArchivoArrayListComision(String ruta) {
        this.ruta = ruta;
    }
    
    public void crearArchivo() {
        try {
            File archivo = new File(ruta);
            if (archivo.exists()) {
                System.out.println("El archivo ya existe!!!");
            } else {
                archivo.createNewFile();
                System.out.println("Archivo creado.");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void escribirArchivo(ArrayList<Comision> lista) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream("temporal.dat");
            oos = new ObjectOutputStream(fos);
            
            fis = new FileInputStream(ruta);
            ois = new ObjectInputStream(fis);
            
            while (true) {
                ArrayList<Comision> aux = (ArrayList<Comision>)ois.readObject();
                oos.writeObject(aux);
            }
        } catch (Exception ex) {
            try {
                oos.writeObject(lista);
                System.out.println("Agregado con exito.");
                
                fis.close();
                fos.close();
            } catch (Exception ex2) {
                System.out.println(ex.getMessage());
            }
            File archivoOriginal = new File(ruta);
            File archivoTemporal = new File("temporal.dat");
            
            archivoOriginal.delete();
            archivoTemporal.renameTo(archivoOriginal);
        }
    }
    public ArrayList<Comision> leerArchivo() {
        ArrayList<Comision> lista = null;
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(ruta);
            ois = new ObjectInputStream (fis);
            
            while (true) {
                lista = (ArrayList<Comision>) ois.readObject();
            }
        } catch (Exception ex) {
            System.out.println("Fin archivo");
        } finally {
            try {
                fis.close();
            } catch (Exception ex2) {
            }
        }
        
        return lista;
    }
    public void eliminarArchivo() {
        try {
            File archivo = new File(ruta);
            archivo.delete();
            System.out.println("Archivo eliminado.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void editarArchivo(ArrayList<Comision> nuevaLista) {
        eliminarArchivo();
        crearArchivo();
        escribirArchivo(nuevaLista);
        System.out.println("Archivo editado...");
    }
}
