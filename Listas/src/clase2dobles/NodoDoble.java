package clase2dobles;

public class NodoDoble {
	
	private Amigo elem;
	private NodoDoble ant, sig;
	
	public NodoDoble () {
		ant = sig = null;
	}
	
	public Amigo getElem() {
		return elem;
	}
	public void setElem(Amigo elem) {
		this.elem = elem;
	}
	public NodoDoble getAnt() {
		return ant;
	}
	public void setAnt(NodoDoble ant) {
		this.ant = ant;
	}
	public NodoDoble getSig() {
		return sig;
	}
	public void setSig(NodoDoble sig) {
		this.sig = sig;
	}
	

	
}
