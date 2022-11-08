package clase2objeto;

public class principal {

	public static void main(String[] args) {
		// COLA CIRCULAR CON OBJETOS
		ColaCircular c = new ColaCircular();
		c.llenar(5);
		c.mostrar();
		
		c.eliminar();
		c.eliminar();
		c.eliminar();
		c.adicionar(new Celular("samsung", 234));
		c.mostrar();
	}

}
