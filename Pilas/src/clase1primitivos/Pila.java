package clase1primitivos;

public class Pila {
	int tam, max = 100;
	int v[] = new int[max];
	
	public Pila () { tam = 0; }
	
	public boolean esVacia() { return tam == 0; }
	public boolean esLlena() {return tam == 100;}
	public int nroElem () { return tam;}
	public void adicionar (int x) {
		if (!esLlena()) {
			v[tam++] = x; 
		} else {
			System.out.println("Pila llena!");
		}
	}
	public int eliminar() {
		int x = -1;
		if (!esVacia()) {
			x = v[--tam];
		} else {
			System.out.println("Pila vacia!");
		}
		return x;
	}
	
	public void vaciar (Pila p) { //vaciamos de la pila p a nuestra pila
		while (!p.esVacia()) 
			this.adicionar(p.eliminar());
	}
	
	public void llenar (int n) {
		for (int i  = 1 ; i <= n; i++) 
			this.adicionar(i);
	}
	
	public void mostrar () {
//		Pila aux = this; //hacer esto toma un puntero :O
		
		Pila aux = new Pila();
		while (!esVacia()) {
			int x = eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		
		this.vaciar(aux);
		
	}
}