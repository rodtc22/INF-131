package clase3MulticolaSimple;

public class Cola {
	private int ini, fin, max = 100;
	private int v[] = new int[max];
	
	public Cola () {
		ini = fin = 0;
	}
	
	public boolean esVacia() { return ini == fin; }
	public boolean esLlena() { return fin == max; }
	public int nroElem() { return fin - ini; }
	
	public void adicionar (int x) {
		if (!esLlena()) v[fin++] = x;
		else System.out.println("Cola Llena!");
	}
	
	public int eliminar () {
		int x = 0;
		if (!esVacia()) x = v[ini++];
		else System.out.println("Cola Vacia!");
		return x;
	}
	
	public void vaciar (Cola c) {
		while (!c.esVacia()) 
			adicionar(c.eliminar());
	}
	
	public void llenar (int n) {
		for (int i =1 ;i <= n; i++)
			adicionar(i);
	}
	
	public void mostrar () {
		Cola aux = new Cola();
		
		while (!esVacia()) {
			int x = eliminar();
			System.out.print(x + " ");
			aux.adicionar(x);
		}System.out.println();
		
		this.vaciar(aux);
	}
}
