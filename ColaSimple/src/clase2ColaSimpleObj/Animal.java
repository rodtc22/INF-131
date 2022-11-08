package clase2ColaSimpleObj;

public class Animal {
	
	private String raza;
	private int edad;
	
	public Animal () {
		this.raza = "perro";
		this.edad = 23;
	}
	
	public Animal(String raza, int edad) {
		this.raza = raza;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", edad=" + edad + "]";
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
