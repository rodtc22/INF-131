package clase2binariobusqueda;

public class Persona {
	private String nombre;
	private int ci;
	
	public Persona() {		
		this.nombre = "rodrigo";
		this.ci = 0;
	}
	
	public Persona(String nombre, int ci) {		
		this.nombre = nombre;
		this.ci = ci;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ci=" + ci + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}
	
	
	
	
}
