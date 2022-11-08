package clase3multicolacircular;

public class MultiColaCircular {
	private int ini, fin, max = 100;
	private ColaCircular v[] = new ColaCircular[max];
	
	public MultiColaCircular () {
		ini = fin = 0;
	}
	
	public int nroElem() { return (fin - ini + max) % max; }
	public boolean esVacia() { return nroElem() == 0; }
	public boolean esLlena() { return nroElem() == max-1; }
	
	public void adicionar (ColaCircular x) {
		if (!esLlena()) {
			v[fin] = x;
			fin = (fin + 1) % max;
		} else {
			System.out.println("MultiColaCircular LLena!");
		}
	}
	
	public ColaCircular eliminar () {
		ColaCircular x = new ColaCircular();
		if (!esVacia()) {
			x = v[ini];
			ini = (ini + 1) % max;
		} else {
			System.out.println("ColaCircular Vacia!");
		}
		return x;
	}
	
	public void vaciar (MultiColaCircular c) {
		while (!c.esVacia()) 
			adicionar(c.eliminar());
	}
	
	public void llenar (int n) {
		for (int i = 0 ;i < n; i++) {
			ColaCircular c = new ColaCircular();
			c.llenar(i+1);
			adicionar(c);
		}
	}
	
	public void mostrar () {
		MultiColaCircular aux = new MultiColaCircular ();
		
		while (!esVacia()) {
			ColaCircular x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}System.out.println();
		
		vaciar(aux);
	}
	
	
	// para los iesimos
	public int nroelem(int i) { return v[i-1].nroElem(); }
	public boolean esVacia(int i) { return v[i-1].esVacia(); }
	public boolean esLlena(int i) {return v[i-1].esLlena();}
	public void adicionar (int i, int x) { v[i-1].adicionar(x); }
	public int eliminar (int i) { return v[i-1].eliminar(); }
	public void vaciar (int i, ColaCircular c) { v[i-1].vaciar(c);}
	public void vaciar (int i, int j) {v[i-1].vaciar(v[j-1]);}
}
