package clase1binario;

public class NodoArbol {
	private Foto elem;
	private NodoArbol izq, der;
	
	public NodoArbol() {
		izq = der = null;
	}

	public Foto getElem() {
		return elem;
	}

	public void setElem(Foto elem) {
		this.elem = elem;
	}

	public NodoArbol getIzq() {
		return izq;
	}

	public void setIzq(NodoArbol izq) {
		this.izq = izq;
	}

	public NodoArbol getDer() {
		return der;
	}

	public void setDer(NodoArbol der) {
		this.der = der;
	}
	
	
}
