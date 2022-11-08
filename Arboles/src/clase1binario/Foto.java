package clase1binario;

public class Foto {
	
	private String recuerdo;
	private int anio;
	
	
	
	public Foto() {
		this.recuerdo = "colegio";
		this.anio = 2016;
	}

	public Foto(String recuerdo, int anio) {
		this.recuerdo = recuerdo;
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Foto [recuerdo=" + recuerdo + ", anio=" + anio + "]";
	}

	public String getRecuerdo() {
		return recuerdo;
	}

	public void setRecuerdo(String recuerdo) {
		this.recuerdo = recuerdo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
}
