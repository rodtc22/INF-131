package clase2dobles;

public class Amigo {
	private String nombre;
	private int anioAmistad;
	
	public Amigo() {
		this.nombre = "vidal";
		this.anioAmistad = 23;
	}
	
	public Amigo(String nombre, int anioAmistad) {
		this.nombre = nombre;
		this.anioAmistad = anioAmistad;
	}
	
	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", anioAmistad=" + anioAmistad + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioAmistad() {
		return anioAmistad;
	}
	public void setAnioAmistad(int anioAmistad) {
		this.anioAmistad = anioAmistad;
	}
	
	
	
}
