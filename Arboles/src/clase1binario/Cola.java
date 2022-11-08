package clase1binario;

public class Cola {
	private int ini, fin, max = 100;
	private NodoArbol [] v = new NodoArbol[max];
	
	public Cola () {
		ini = fin = 0;
	}
	
	public boolean esVacia() { return ini == fin; }
	public boolean esLlena() { return fin == max; }
	public int nroelem() { return fin - ini; }
	public void adicionar (NodoArbol x) {
		if (!esLlena()) v[fin++] = x;
		else System.out.println("Cola llena!");
	}
	public NodoArbol eliminar () {
		NodoArbol x =new NodoArbol();
		if (!esVacia()) {
			x = v[ini++];
			if (ini == fin) 
				ini = fin = 0;
		}
		else 
			System.out.println("Cola vacia!");
		return x;
	}
	
	public void vaciar(Cola c) {
		while (!c.esVacia()) 
			adicionar(c.eliminar());
	}
	
	public void mostrar () {
		Cola aux = new Cola();
		
		while (!esVacia()) {
			NodoArbol x = eliminar();
			System.out.println(x.getElem());
			aux.adicionar(x);
		}
		
		vaciar(aux);
	}
}
