package clase1primitivos;

public class principal {

	public static void main(String[] args) {
		// PARA DATOS PRIMITIVOS	
		
		Pila p = new Pila();
		p.llenar(4);
		p.llenar(2);
	
		p.mostrar();
		p.mostrar();
		
		System.out.println(p.nroElem());
	}

}
