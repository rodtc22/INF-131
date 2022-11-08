package clase2objeto;

public class ColaCircular {
	private int ini, fin, max = 100;
	private Celular v [] = new Celular[max];
	
	public ColaCircular() {
		ini = fin = 0;
	}
	
	public int nroElem () { return (fin - ini + max) % max;}
	public boolean esVacia() { return nroElem() == 0; }
	public boolean esLlena() { return nroElem() == max - 1;}
	
	public void adicionar (Celular x) {
		if (!esLlena()) {
			v[fin] = x;
			fin = (fin + 1) % max;
		} else {
			System.out.println("ColaCircular Llena!");
		}
	}
	
	public Celular eliminar () {
		Celular x = new Celular();
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
			adicionar (new Celular("xiaomi"+i, i +1000));
	}
	
	public void mostrar () {
		ColaCircular aux = new ColaCircular();
		
		while (!esVacia()) {
			Celular x = eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}System.out.println();
		
		vaciar(aux);
	}
}
