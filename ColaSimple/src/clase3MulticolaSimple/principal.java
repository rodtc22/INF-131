package clase3MulticolaSimple;

public class principal {

	public static void main(String[] args) {
		// MULTICOLA
//		Cola c = new Cola();
//		c.llenar(34);
//		c.mostrar();
		
		MultiCola mc = new MultiCola();
		mc.llenar(5);
		mc.mostrar();
		
		mc.eliminar(4);
		mc.eliminar(4);
		mc.eliminar(4);
		mc.eliminar(4);
		
		mc.mostrar();
	}

}
