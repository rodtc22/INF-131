/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

import java.io.Serializable;

public class NodoSimpleJugador implements Serializable {
	
	private Jugador elem;
	private NodoSimpleJugador sig;
	
	public NodoSimpleJugador() {
		sig = null;
	}
	
	public Jugador getElem() {
		return elem;
	}
	public void setElem(Jugador elem) {
		this.elem = elem;
	}
	public NodoSimpleJugador getSig() {
		return sig;
	}
	public void setSig(NodoSimpleJugador sig) {
		this.sig = sig;
	}
	
	
}
