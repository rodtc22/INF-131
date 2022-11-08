package clase1simple;

public class NodoSimple {
	
	private Persona elem;
	private NodoSimple sig;
	
	public NodoSimple() {
		sig = null;
	}
	
	public Persona getElem() {
		return elem;
	}
	public void setElem(Persona elem) {
		this.elem = elem;
	}
	public NodoSimple getSig() {
		return sig;
	}
	public void setSig(NodoSimple sig) {
		this.sig = sig;
	}
	
	
}
