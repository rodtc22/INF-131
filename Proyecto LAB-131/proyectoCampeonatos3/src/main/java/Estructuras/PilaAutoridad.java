/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import Clases.Autoridad;
import java.io.Serializable;

/**
 *
 * @author rodri
 */
public class PilaAutoridad implements Serializable {
	int tam, max = 100;
	Autoridad v [] = new Autoridad[max];
	
	public PilaAutoridad () { tam = 0; }
	public boolean esVacia() { return tam == 0; }
	public boolean esLlena() {return tam == max; }
	public int nroElem () { return tam ; }
	public void adicionar (Autoridad x) {
		if (!esLlena()) {
			v[tam++] = x;
		} else {
			System.out.println("PilaAutoridad llena!");
		}
	}
	public Autoridad eliminar() {
		Autoridad x = new Autoridad();
		
		if (!esVacia()) {
			x = v[--tam];
		} else {
			System.out.println("PilaAutoridad Vacia!");
		}
		return x;
	}
	
	public void vaciar (PilaAutoridad p) {
		while (!p.esVacia())
			this.adicionar(p.eliminar());
	}
	
	public void llenar (int n) {
		for (int i = 1  ;i <= n ;i++) {
			adicionar(new Autoridad("juanito choque "+i, "presidente" +i, i*1000));
		}
	}
	
	public void mostrar () {
		PilaAutoridad aux = new PilaAutoridad();
		
		while (!this.esVacia()) {
			Autoridad x = this.eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		
		this.vaciar(aux);
	}
        
//        ==================================================PENDIENTE
//        public PilaAutoridad copiar () {
//            PilaAutoridad aux = new PilaAutoridad();
//            PilaAutoridad nueva = new PilaAutoridad();
//            
//            while (!this.esVacia()) {
//                Autoridad  a = this.eliminar();
//                nueva.adicionar(a);
//                aux.adicionar(a);
//            }
//            
//            while (!aux.esVacia()) {
//                this.adicionar(aux.eliminar());
//            }
//            
//            
//            return nueva;
//            
//        }

    @Override
    public String toString() {
        String s = "";
        PilaAutoridad aux = new PilaAutoridad();
		
        while (!this.esVacia()) {
                Autoridad x = this.eliminar();
                s = s + x;
                s = s + "\n";
                aux.adicionar(x);
        }

        this.vaciar(aux);
        return s;
    }
        
        
}
