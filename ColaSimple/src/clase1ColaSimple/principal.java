package clase1ColaSimple;

public class principal {

	public static void main(String[] args) {
		// COLA SIMPLE
		
		Cola c = new Cola();
		c.llenar(6);
		c.adicionar(41545);
		c.mostrar();
		
		int x = c.eliminar();
		x = c.eliminar();
		
		c.mostrar();
	}

}
