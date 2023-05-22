/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import Clases.Campeonato;
import java.io.Serializable;

/**
 *
 * @author rodri
 */
public class NodoDobleCampeonato implements Serializable {
	
	private Campeonato elem;
	private NodoDobleCampeonato ant, sig;
	
	public NodoDobleCampeonato () {
		ant = sig = null;
	}
	
	public Campeonato getElem() {
		return elem;
	}
	public void setElem(Campeonato elem) {
		this.elem = elem;
	}
	public NodoDobleCampeonato getAnt() {
		return ant;
	}
	public void setAnt(NodoDobleCampeonato ant) {
		this.ant = ant;
	}
	public NodoDobleCampeonato getSig() {
		return sig;
	}
	public void setSig(NodoDobleCampeonato sig) {
		this.sig = sig;
	}
}

