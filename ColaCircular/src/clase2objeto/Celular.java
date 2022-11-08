package clase2objeto;

public class Celular {
	private String marca;
	private int costo;
	
	public Celular() {
		this.marca = "Samsung";
		this.costo = 2134;
	}
	
	public Celular(String marca, int costo) {
		this.marca = marca;
		this.costo = costo;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", costo=" + costo + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
}
