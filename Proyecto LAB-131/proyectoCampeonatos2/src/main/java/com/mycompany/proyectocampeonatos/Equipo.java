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
public class Equipo implements Serializable {
    private String nombreEquipo;
    private String colorEquipo;
    private ListaSimpleJugador lsj = null;

    public Equipo(String nombreEquipo, String colorEquipo, ListaSimpleJugador lsj) {
        this.nombreEquipo = nombreEquipo;
        this.colorEquipo = colorEquipo;
        this.lsj = lsj;
    }
    
    public Equipo() {}

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getColorEquipo() {
        return colorEquipo;
    }

    public void setColorEquipo(String colorEquipo) {
        this.colorEquipo = colorEquipo;
    }

    public ListaSimpleJugador getLsj() {
        return lsj;
    }

    public void setLsj(ListaSimpleJugador lsj) {
        this.lsj = lsj;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", colorEquipo=" + colorEquipo + ",lsj=\n" + lsj + '}';
    }
    
    
    
}
