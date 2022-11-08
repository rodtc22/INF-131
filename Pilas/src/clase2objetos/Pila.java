package clase2objetos;

public class Pila {
	int tam, max = 100;
	Persona v [] = new Persona[max];
	
	public Pila () { tam = 0; }
	public boolean esVacia() { return tam == 0; }
	public boolean esLlena() {return tam == max; }
	public int nroElem () { return tam ; }
	public void adicionar (Persona x) {
		if (!esLlena()) {
			v[tam++] = x;
		} else {
			System.out.println("Pila llena!");
		}
	}
	public Persona eliminar() {
		Persona x = new Persona();
		
		if (!esVacia()) {
			x = v[--tam];
		} else {
			System.out.println("Pila Vacia!");
		}
		return x;
	}
	
	public void vaciar (Pila p) {
		while (!p.esVacia())
			this.adicionar(p.eliminar());
	}
	
	public void llenar (int n) {
		for (int i = 1  ;i <= n ;i++) {
			adicionar(new Persona("juan"+i, i));
		}
	}
	
	public void mostrar () {
		Pila aux = new Pila();
		
		while (!this.esVacia()) {
			Persona x = this.eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		
		this.vaciar(aux);
	}
}
