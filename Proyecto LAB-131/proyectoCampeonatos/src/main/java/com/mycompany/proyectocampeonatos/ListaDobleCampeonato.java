/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocampeonatos;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rodri
 */
public class ListaDobleCampeonato {
	
	private NodoDobleCampeonato p;
	
	public ListaDobleCampeonato () {
		p = null;
	}
	
	public boolean esVacia() {
		return p == null;
	}
	
	public int nroElem() {
		int cnt = 0;
		NodoDobleCampeonato r = p;
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}
	
	public void adiFin (Campeonato elem) {
            NodoDobleCampeonato x = new NodoDobleCampeonato();
            x.setElem(elem);
		if (esVacia()) {
			p = x;
		} else {
			NodoDobleCampeonato r = p;
			while (r.getSig() != null)
				r = r.getSig();
			r.setSig(x); 
			x.setAnt(r);
		}
	}
	
	public void adiIni (Campeonato elem) {
            NodoDobleCampeonato x = new NodoDobleCampeonato();
            x.setElem(elem);
		if (esVacia()) {
			p = x;
		} else {
			x.setSig(p);
			p.setAnt(x);
			p = x;
		}
	}
	
	public NodoDobleCampeonato eliFin () { //recordar que el nodo debe estar completamente aislado antes de devolverlo
		NodoDobleCampeonato x = p;
		if (!esVacia()) {
			if (x.getSig() == null) {
				p = null;
			} else {
				while (x.getSig() != null) 
					x = x.getSig();
				
				x.getAnt().setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	public NodoDobleCampeonato eliIni () {
		NodoDobleCampeonato x = p;
		if (!esVacia()) {
			p = p.getSig();
			if (p != null) {
				p.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	public void llenar (int n) {
            for (int i = 0 ;i < n; i++) {
                ColaCircularEquipo cce = new ColaCircularEquipo();
                cce.llenar(2);
                
                List<Arbitro> listaArbitros = new LinkedList<Arbitro>();
                listaArbitros.add(new Arbitro("CARLOS "+i, i+10, (i+10)*1000));
                
                Campeonato c = new Campeonato("campeonato Nro "+i, "inicio"+i, "fin" + i, i+50, cce, listaArbitros);
                adiFin(c);
            }
	}

    @Override
    public String toString() {
        String s = "";
        NodoDobleCampeonato r = p;
        while (r != null) {
                s = s + r.getElem(); s = s + "\n";
                r = r.getSig();
        } System.out.println();
        return s;
    }
        
        
	
	public void mostrar () {
		NodoDobleCampeonato r = p;
		while (r != null) {
			System.out.println(r.getElem());
			r = r.getSig();
		} System.out.println();
	}

	public NodoDobleCampeonato getP() {
		return p;
	}

	public void setP(NodoDobleCampeonato p) {
		this.p = p;
	}
}
