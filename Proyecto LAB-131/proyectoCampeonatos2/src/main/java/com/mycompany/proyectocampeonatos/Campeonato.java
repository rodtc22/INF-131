/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rodri
 */
public class Campeonato implements Serializable {
    private String nombreCampeonato;
    private String fechaInicio;
    private String fechaFinalizacion;
    private double montoInscripcion;
    private ColaCircularEquipo cce = null;
    private List<Arbitro> listaArbitros = new LinkedList<Arbitro>();

    public Campeonato(String nombreCampeonato, String fechaInicio, String fechaFinalizacion, double montoInscripcion, ColaCircularEquipo cce, List<Arbitro> listaArbitros) {
        this.nombreCampeonato = nombreCampeonato;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.montoInscripcion = montoInscripcion;
        this.cce = cce;
        this.listaArbitros = listaArbitros;
    }
    
    public Campeonato() {}

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public double getMontoInscripcion() {
        return montoInscripcion;
    }

    public void setMontoInscripcion(double montoInscripcion) {
        this.montoInscripcion = montoInscripcion;
    }

    public ColaCircularEquipo getCce() {
        return cce;
    }

    public void setCce(ColaCircularEquipo cce) {
        this.cce = cce;
    }

    public List<Arbitro> getListaArbitros() {
        return listaArbitros;
    }

    public void setListaArbitros(List<Arbitro> listaArbitros) {
        this.listaArbitros = listaArbitros;
    }

    @Override
    public String toString() {
        return "Campeonato{" + "nombreCampeonato=" + nombreCampeonato + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + ", montoInscripcion=" + montoInscripcion + ",\ncce=" + cce + ",\nlistaArbitros=" + listaArbitros + '}';
    }
    
    
    
}
