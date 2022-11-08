package clase1simple;

public class principal {

	public static void main(String[] args) {
		// COLA CIRCULAR 
		ColaCircular cc = new ColaCircular();
		cc.llenar(4);
		cc.mostrar();
		
		cc.eliminar();
		cc.eliminar();
		cc.adicionar(23);
		cc.adicionar(45);
		cc.eliminar();
		cc.eliminar();
		cc.adicionar(3);
		cc.adicionar(1);
		
		cc.mostrar();
		System.out.println(cc.nroElem());
	}

}
