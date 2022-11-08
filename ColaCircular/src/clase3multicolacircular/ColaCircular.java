package clase3multicolacircular;

public class ColaCircular {
	private int ini, fin, max = 100;
	private int v[] = new int[max];
	
	public ColaCircular () {
		ini = fin = 0;
	}
	
	public int nroElem() { return (fin - ini + max) % max; }
	public boolean esVacia() { return nroElem() == 0; }
	public boolean esLlena() { return nroElem() == max-1; }
	
	public void adicionar (int x) {
		if (!esLlena()) {
			v[fin] = x;
			fin = (fin + 1) % max;
		} else {
			System.out.println("ColaCircular LLena!");
		}
	}
	
	public int eliminar () {
		int x = 0;
		if (!esVacia()) {
			x = v[ini];
			ini = (ini + 1) % max;
		} else {
			System.out.println("ColaCircular Vacia!");
		}
		return x;
	}
	
	public void vaciar (ColaCircular c) {
		while (!c.esVacia()) 
			adicionar(c.eliminar());
	}
	
	public void llenar (int n) {
		for (int i = 0 ;i < n; i++) 
			adicionar(i);
	}
	
	public void mostrar () {
		ColaCircular aux = new ColaCircular();
		
		while (!esVacia()) {
			int x = eliminar();
			System.out.print(x + " ");
			aux.adicionar(x);
		}System.out.println();
		
		vaciar(aux);
	}
}
