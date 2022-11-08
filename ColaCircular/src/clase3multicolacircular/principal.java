package clase3multicolacircular;

public class principal {

	public static void main(String[] args) {
		// MULTICOLACIRCULAR
		MultiColaCircular mcc = new MultiColaCircular();
		mcc.llenar(3);
		mcc.mostrar();
		
		mcc.eliminar(2);
		mcc.eliminar(2);
		mcc.adicionar(2, 234);
		mcc.adicionar(1, 123);
		
		mcc.mostrar();
	}

}
