package clase3mutipila;

public class Pila {
	private int tam, max = 100;
	private int v[] = new int[max];
	
	public Pila () { tam = 0; }
	
	public boolean esVacia() { return tam == 0; }
	public boolean esLlena() { return tam == max; }
	public int nroElem() {return tam;};
	
	public void adicionar (int x) {
		if (!esLlena()) v[tam++] = x;
		else System.out.println("Pila llena!");
	}
	
	public int eliminar () {
		int x = 0;
		if (!esVacia()) x = v[--tam];
		else System.out.println("Pila Vacia!");
		return x;
	}
	
	public void vaciar (Pila p) {
		while (!p.esVacia()) 
			this.adicionar(p.eliminar());
	}
	
	public void llenar (int n) {
		for (int i= 1 ;i <= n; i++) 
			this.adicionar(i);
	}
	
	public void mostrar () {
		Pila aux = new Pila ();
		while (!this.esVacia()) {
			int x = this.eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		this.vaciar(aux);
	}
	
}
