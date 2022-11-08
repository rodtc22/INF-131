package clase2binariobusqueda;

public class NodoABB {
	private Persona elem;
	private NodoABB izq, der;
	
	public NodoABB () {
		izq = der = null;
	}

	public Persona getElem() {
		return elem;
	}

	public void setElem(Persona elem) {
		this.elem = elem;
	}

	public NodoABB getIzq() {
		return izq;
	}

	public void setIzq(NodoABB izq) {
		this.izq = izq;
	}

	public NodoABB getDer() {
		return der;
	}

	public void setDer(NodoABB der) {
		this.der = der;
	}
	
	
}
