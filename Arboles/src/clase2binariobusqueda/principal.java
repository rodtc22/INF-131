package clase2binariobusqueda;

public class principal {
	public static void main (String [] args) {
		ABBusqueda abb = new ABBusqueda();
		abb.llenar(5);
		abb.preorden(abb.getR());
		
		System.out.println("Maximo: "+ abb.getMaxi(abb.getR()));
	}
}


