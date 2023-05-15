/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

/**
 *
 * @author rodri
 */
public class Arbitro {
    private String nombreArbitro;
    private int experiencia;
    private double sueldo;

    public Arbitro(String nombreArbitro, int experiencia, double sueldo) {
        this.nombreArbitro = nombreArbitro;
        this.experiencia = experiencia;
        this.sueldo = sueldo;
    }
    
    public Arbitro() {}

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Arbitro{" + "nombreArbitro=" + nombreArbitro + ", experiencia=" + experiencia + ", sueldo=" + sueldo + '}';
    }
    
    
}
