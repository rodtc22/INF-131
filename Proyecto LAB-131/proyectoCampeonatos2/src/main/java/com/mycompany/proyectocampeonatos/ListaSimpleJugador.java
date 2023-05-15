/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

import java.io.Serializable;

public class ListaSimpleJugador implements Serializable { // solo trabaja con nodos, por eso adi nodos, y devuelve nodos
	
	private NodoSimpleJugador p;
	
	public ListaSimpleJugador() {
		p = null;
	}

	public NodoSimpleJugador getP() {
		return p;
	}

	public void setP(NodoSimpleJugador p) {
		this.p = p;
	}
	
	public boolean esVacia() { return p == null; }
	
	public int nroElem() {
		int cnt = 0;
		
		NodoSimpleJugador r = p;
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		
		return cnt;
	}
	
	public void adiFin (Jugador elem) {
            NodoSimpleJugador x = new NodoSimpleJugador();
            x.setElem(elem);
		if (!esVacia()) {
			NodoSimpleJugador r = p;
			while (r.getSig() != null) {
				r = r.getSig();
			}
			r.setSig(x);
		} else {
			p = x;
		}
	}
	
	public void adiIni (Jugador elem) {
            NodoSimpleJugador x = new NodoSimpleJugador();
            x.setElem(elem);
		if (!esVacia()) {
			x.setSig(p);
			p = x;
		} else {
			p = x;
		}
	}
	
	public NodoSimpleJugador eliFin () {
		NodoSimpleJugador x = new NodoSimpleJugador();
		if (!esVacia()) {
			NodoSimpleJugador r = p;
			NodoSimpleJugador q = p;
			
			if (nroElem() == 1) {
				x = p;
				p = null;
			} else {				
				while (r.getSig() != null) {
					q = r;
					r = r.getSig();
				}
				
				x = r;
				q.setSig(null);
			}
		} else {
			System.out.println("ListaSimpleJugador vacia!");
		}
		return x;
	}
	
	public NodoSimpleJugador eliIni() {
		NodoSimpleJugador x = new NodoSimpleJugador();
		
		if (!esVacia()) {
			x = p;
			p = p.getSig();
		} else {
			System.out.println("Lista simple vacia!");
		}
			
		return x;
	}
	
	public void llenar (int n) {
		for (int i = 0 ;i < n; i++) {
			adiFin(new Jugador("PEPE"+i,"PEPE"+i,"PEPE"+i,i,"PEPE"+i ));
		}
	}
	
	public void mostrar () {
		NodoSimpleJugador r = p;
		while (r!= null) {
			System.out.println(r.getElem());
			r = r.getSig();
		} System.out.println();
	}

    @Override
    public String toString() {
        String s = "";
        NodoSimpleJugador r = p;
        while (r!= null) {
                s = s + r.getElem(); s = s + "\n";
                r = r.getSig();
        } System.out.println();
        return s;
    }
	
        
}