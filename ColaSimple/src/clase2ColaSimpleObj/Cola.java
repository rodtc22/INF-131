package clase2ColaSimpleObj;

public class Cola {
	private int ini, fin, max = 100;
	private Animal v[] = new Animal[max];
	
	public Cola () { ini = fin = 0; }
	public boolean esVacia() { return ini == fin; }
	public boolean esLlena() { return fin == max; }
	public int nroElem() { return fin - ini; }
	
	public void adicionar (Animal x) {
		if (!esLlena()) v[fin++] = x;
		else System.out.println("Cola Llena!");
	}
	
	public Animal eliminar () {
		Animal x = new Animal();
		if (!esVacia()) x = v[ini++];
		else System.out.println("Cola Vacia!");
		return x;
	}
	
	public void vaciar (Cola c) {
		while (!c.esVacia())
			this.adicionar(c.eliminar());
	}
	
	public void llenar (int n) {
		for (int i = 0 ;i < n; i++)
			this.adicionar(new Animal("choco "+i, i));
	}
	
	public void mostrar () {
		Cola aux = new Cola();
		
		while (!esVacia()) {
			Animal x = eliminar();
			System.out.println(x);
			aux.adicionar(x);
		} System.out.println();
		
		this.vaciar(aux);
	}
}
