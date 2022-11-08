package clase2dobles;

public class NodoD {

	private Premio elem;
	private NodoD sig, ant;
	
	public NodoD () {
		sig = ant = null;
	}

	
	public Premio getElem() {
		return elem;
	}

	public void setElem(Premio elem) {
		this.elem = elem;
	}

	public NodoD getSig() {
		return sig;
	}

	public void setSig(NodoD sig) {
		this.sig = sig;
	}

	public NodoD getAnt() {
		return ant;
	}

	public void setAnt(NodoD ant) {
		this.ant = ant;
	}
	
	
}
