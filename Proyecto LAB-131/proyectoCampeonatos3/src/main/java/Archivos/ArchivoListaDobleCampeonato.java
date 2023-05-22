/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Estructuras.ListaDobleCampeonato;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author rodri
 */
public class ArchivoListaDobleCampeonato {
    private String ruta;

    public ArchivoListaDobleCampeonato(String ruta) {
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
    public void escribirArchivo(ListaDobleCampeonato lista) {
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
                ListaDobleCampeonato aux = (ListaDobleCampeonato) ois.readObject();
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
    public ListaDobleCampeonato leerArchivo() {
        ListaDobleCampeonato lista = null;
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(ruta);
            ois = new ObjectInputStream (fis);
            
            while (true) {
                lista = (ListaDobleCampeonato) ois.readObject();
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
    
    public void editarArchivo(ListaDobleCampeonato nuevaLista) {
        eliminarArchivo();
        crearArchivo();
        escribirArchivo(nuevaLista);
        System.out.println("Archivo editado...");
    }
}
