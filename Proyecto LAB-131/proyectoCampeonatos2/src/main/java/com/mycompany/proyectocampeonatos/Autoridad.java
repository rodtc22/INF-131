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
public class Autoridad implements Serializable {
    private String nombreCompleto;
    private String cargo;
    private double sueldo;

    public Autoridad(String nombreCompleto, String cargo, double sueldo) {
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    public Autoridad() {}

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "  Autoridad{" + "nombreCompleto=" + nombreCompleto + ", cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
    
    
}
