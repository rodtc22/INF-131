package clase2dobles;

public class ListaDoble {
	
	private NodoDoble p;
	
	public ListaDoble () {
		p = null;
	}
	
	public boolean esVacia() {
		return p == null;
	}
	
	public int nroElem() {
		int cnt = 0;
		NodoDoble r = p;
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}
	
	public void adiFin (NodoDoble x) {
		if (esVacia()) {
			p = x;
		} else {
			NodoDoble r = p;
			while (r.getSig() != null)
				r = r.getSig();
			r.setSig(x); 
			x.setAnt(r);
		}
	}
	
	public void adiIni (NodoDoble x) {
		if (esVacia()) {
			p = x;
		} else {
			x.setSig(p);
			p.setAnt(x);
			p = x;
		}
	}
	
	public NodoDoble eliFin () { //recordar que el nodo debe estar completamente aislado antes de devolverlo
		NodoDoble x = p;
		if (!esVacia()) {
			if (x.getSig() == null) {
				p = null;
			} else {
				while (x.getSig() != null) 
					x = x.getSig();
				
				x.getAnt().setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	public NodoDoble eliIni () {
		NodoDoble x = p;
		if (!esVacia()) {
			p = p.getSig();
			if (p != null) {
				p.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	public void llenar (int n) {
		for (int i = 0 ;i < n; i++) {
			NodoDoble x = new NodoDoble();
			x.setElem(new Amigo("rodrix"+i, i ));
			adiFin(x);
		}
	}
	
	public void mostrar () {
		NodoDoble r = p;
		while (r != null) {
			System.out.println(r.getElem());
			r = r.getSig();
		} System.out.println();
	}

	public NodoDoble getP() {
		return p;
	}

	public void setP(NodoDoble p) {
		this.p = p;
	}
}
