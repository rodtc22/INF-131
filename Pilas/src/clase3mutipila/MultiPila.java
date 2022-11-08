package clase3mutipila;

public class MultiPila {
	private int tamp, maxp = 100;
	private Pila v[] = new Pila [maxp];
	
	public MultiPila() {
		tamp = 0;
		for (int i = 0 ;i < maxp; i++) 
			v[i] = new Pila();
	}
	
	public boolean esVacia() { return tamp == 0; }
	public boolean esLlena() { return tamp == maxp; }
	public int nroElem() {return tamp;};
	
	public void adicionar (Pila x) {
		if (!esLlena()) v[tamp++] = x;
		else System.out.println("Pila llena!");
	}
	
	public Pila eliminar () {
		Pila x = new Pila();
		if (!esVacia()) x = v[--tamp];
		else System.out.println("Pila Vacia!");
		return x;
	}
	
	public void vaciar (MultiPila mp) {
		while (!mp.esVacia()) 
			this.adicionar(mp.eliminar());
	}
	
	public void llenar (int n) {
		for (int i= 1 ;i <= n; i++) {
			Pila p = new Pila();
			p.llenar(i);
			this.adicionar(p);
		}
	}
	
	public void mostrar () {
		MultiPila aux = new MultiPila ();
		while (!this.esVacia()) {
			Pila x = this.eliminar();
			x.mostrar(); System.out.println();
			aux.adicionar(x);
		}
		this.vaciar(aux);
	}
	
	// AHORA PARA LAS I-ESIMAS, pero hacemos ajuste para index 0, por que nos envian index 1
	public boolean esVacia(int i) { return v[i-1].esVacia(); }
	public boolean esLlena(int i) { return v[i-1].esLlena(); }
	public int nroElem(int i) { return v[i-1].nroElem(); }
	
	public void adicionar (int i, int x) {
		if (!esLlena(i)) v[i-1].adicionar(x);
		else System.out.println("Pila iesima Llena");
	}
	
	public int eliminar (int i) {
		int x = -1;
		if (!esVacia(i)) x = v[i-1].eliminar();
		else System.out.println("Pila iesima Vacia");
		return x;
	}
	
	public void vaciar (int i, Pila p) { //vaciamo a la pila i-esima
		v[i-1].vaciar(p);
	}
	
	public void vaciar (int i, int j) { //vaciamo de la j-esima a la i-esima
		v[i-1].vaciar(v[j-1]);
	}
}