package clase1binario;

import java.io.FileNotFoundException;

public class principal {
	public static void main (String [] args) throws FileNotFoundException {
		// ARBOL BINARIO SIMPLE
//		System.out.println("holi xd");
		ArbolBinario ab = new ArbolBinario();
		NodoArbol na = new NodoArbol();
		ab.setR(na);
		
		ab.crear(na);
		ab.inorden(ab.getR()); System.out.println();
//		ab.preorden(ab.getR()); System.out.println();
//		ab.postorden(ab.getR()); System.out.println();
	}
}
