/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

import java.io.Serializable;

public class ColaCircularEquipo implements Serializable {
	private int ini, fin, max = 100;
	private Equipo v [] = new Equipo[max];
	
	public ColaCircularEquipo() {
		ini = fin = 0;
	}
	
	public int nroElem () { return (fin - ini + max) % max;}
	public boolean esVacia() { return nroElem() == 0; }
	public boolean esLlena() { return nroElem() == max - 1;}
	
	public void adicionar (Equipo x) {
		if (!esLlena()) {
			v[fin] = x;
			fin = (fin + 1) % max;
		} else {
			System.out.println("ColaCircularEquipo Llena!");
		}
	}
	
	public Equipo eliminar () {
		Equipo x = new Equipo();
		if (!esVacia()) {
			x = v[ini];
			ini = (ini + 1) % max;
		} else {
			System.out.println("ColaCircularEquipo Vacia!");
		}
		return x;
	}
	
	public void vaciar (ColaCircularEquipo c) {
		while (!c.esVacia()) 
			adicionar(c.eliminar());
	}
	
	public void llenar (int n) {
            for (int i = 0 ;i < n; i++){
                Equipo x = new Equipo();
                x.setNombreEquipo("bolivar " + i);
                x.setColorEquipo("celeste" + i);
                
                ListaSimpleJugador lsj = new ListaSimpleJugador();
                lsj.llenar(3);
                x.setLsj(lsj);
                
                adicionar(x);
            }
	}
	
	public void mostrar () {
		ColaCircularEquipo aux = new ColaCircularEquipo();
		
		while (!esVacia()) {
			Equipo x = eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}System.out.println();
		
		vaciar(aux);
	}

    @Override
    public String toString() {
        String s = "";
        ColaCircularEquipo aux = new ColaCircularEquipo();
		
        while (!esVacia()) {
                Equipo x = eliminar();
                s = s + x; s = s + "\n";
                aux.adicionar(x);
        }System.out.println();

        vaciar(aux);
        return s;
    }
        
        
        
}
