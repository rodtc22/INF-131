package clase1simple;

public class principal {

	public static void main(String[] args) {
		// LISTAS SIMPLES
		ListaSimple l = new ListaSimple();
		l.llenar(3);
		l.mostrar();
		
		NodoSimple x = l.eliIni();
		System.out.println(x.getElem());
		l.mostrar();

	}

}
