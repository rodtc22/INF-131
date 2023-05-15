/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

import java.io.Serializable;

/**
 *
 * @author rodri
 */
public class Comision implements Serializable {
    private String nombreComision;
    private PilaAutoridad pa = null;

    public Comision(String nombreComision, PilaAutoridad pa) {
        this.nombreComision = nombreComision;
        this.pa = pa;
    }
    
    public Comision() {}

    public String getNombreComision() {
        return nombreComision;
    }

    public void setNombreComision(String nombreComision) {
        this.nombreComision = nombreComision;
    }

    public PilaAutoridad getPa() {
        return pa;
    }

    public void setPa(PilaAutoridad pa) {
        this.pa = pa;
    }

    @Override
    public String toString() {
        return "Comision{" + "nombreComision=" + nombreComision + ", pa=\n" + pa + '}';
    }
    
    
}
