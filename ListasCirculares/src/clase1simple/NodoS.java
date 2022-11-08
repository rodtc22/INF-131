package clase1simple;

public class NodoS {
	
	private Papel elem;
	private NodoS sig;
	
	public NodoS () {
		sig = null;
	}
	
	public Papel getElem() {
		return elem;
	}
	public void setElem(Papel elem) {
		this.elem = elem;
	}
	public NodoS getSig() {
		return sig;
	}
	public void setSig(NodoS sig) {
		this.sig = sig;
	}
	
	
	
}
