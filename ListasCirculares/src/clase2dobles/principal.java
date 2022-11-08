package clase2dobles;

public class principal {

	public static void main(String[] args) {
		// LISTA CIRCULAR DOBLE
		LCDoble lcd = new LCDoble();
		lcd.llenar(4);
		lcd.mostrar();
		
		lcd.eliIni();
		lcd.eliIni();
		lcd.eliFin();
		lcd.mostrar();
		
		lcd.adiIni(new Premio("aaa", 123));
		lcd.adiIni(new Premio("bb", 123));
		lcd.adiFin(new Premio("bb", 123));
		
		lcd.mostrar();
	}

}

