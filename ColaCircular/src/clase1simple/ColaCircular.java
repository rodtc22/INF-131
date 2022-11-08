package clase1simple;

public class ColaCircular {
	private int ini, fin, max = 100;
	private int v[] = new int[max];
	
	public ColaCircular() {
		ini = fin = 0;
	}
	
	public int nroElem () {
		return (fin - ini + max) % max; // recuerda que hay un espacio vacio para la cola circular
	}
	
	public boolean esVacia () { return nroElem() == 0; }
	public boolean esLlena () { return nroElem() == max-1; }
	
	public void adicionar (int x) {
		if (!esLlena()) {
			v[fin] = x;
			fin = (fin + 1) % max;
		} else {
			System.out.println("Cola Llena!");
		}
	}
	
	public int eliminar () {
		int x = 0;
		if (!esVacia()) {
			x = v[ini];
			ini = (ini + 1) % max;
			if (ini == fin)
				ini = fin = 0;
		} else {
			System.out.println("Cola Vacia!");
		}
		return x;
	}
	
	public void vaciar (ColaCircular c) {
		while (!c.esVacia()) 
			adicionar(c.eliminar());
	}
	
	public void llenar (int n) {
		for (int i = 1; i<= n; i++) 
			adicionar(i);
	}
	
	public void mostrar () {
		ColaCircular aux = new ColaCircular();
		
		while (!esVacia()) {
			int x = eliminar();
			System.out.print(x + " ");
			aux.adicionar(x);
		} System.out.println();
		
		this.vaciar(aux);
	}
}
