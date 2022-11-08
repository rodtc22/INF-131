package clase1simple;

public class Papel {
	private String material;
	private int costo;
	
	public Papel() {
		this.material = "bond";
		this.costo = 1234;
	}
	
	public Papel(String material, int costo) {
		this.material = material;
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Papel [material=" + material + ", costo=" + costo + "]";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
}
