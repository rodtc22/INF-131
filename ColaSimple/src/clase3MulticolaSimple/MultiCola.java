package clase3MulticolaSimple;

public class MultiCola {
	private int inic, finc, maxc = 100;
	private Cola v[] = new Cola[maxc];
	
	public MultiCola () {
		inic = finc = 0;
	}
	
	public boolean esVacia() { return inic == finc; }
	public boolean esLlena() { return finc == maxc; }
	public int nroElem() { return finc - inic; }
	
	public void adicionar (Cola x) {
		if (!esLlena()) v[finc++] = x;
		else System.out.println("Cola Llena!");
	}
	
	public Cola eliminar () {
		Cola x = new Cola();
		if (!esVacia()) x = v[inic++];
		else System.out.println("Cola Vacia!");
		return x;
	}
	
	public void vaciar (MultiCola c) {
		while (!c.esVacia()) 
			adicionar(c.eliminar());
	}
	
	public void llenar (int n) {
		for (int i =1 ;i <= n; i++) {
			Cola c = new Cola();
			c.llenar(i);
			adicionar(c);
		}
	}
	
	public void mostrar () {
		MultiCola aux = new MultiCola();
		
		while (!esVacia()) {
			Cola x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}System.out.println();
		
		this.vaciar(aux);
	}
	
	// para los iesimos
	public boolean esVacia (int i) { return v[i-1].esVacia(); }
	public boolean esLlena (int i) { return v[i-1].esLlena(); }
	public int nroElem (int i) { return v[i-1].nroElem(); }
	public void adicionar (int i, int x) { v[i-1].adicionar(x); }
	public int eliminar (int i) { return v[i-1].eliminar(); }
	public void vaciar (int i, Cola aux) { v[i-1].vaciar(aux); }
	public void vaciar (int i, int j) { v[i-1].vaciar(v[j-1]); }
	
}
