package clase1simple;

public class LCSimple {
	
	private NodoS p;
	
	public LCSimple () {
		p = null;
	}

	public boolean esVacia () {
		return p == null;
	}
	
	public int nroElem () {
		int cnt = 0;
		if (!esVacia()) {
			NodoS r = p;
			cnt = 1;
			while (r.getSig() != p) {
				r = r.getSig();
				cnt++;
			}
		}
		return cnt;
	}
	
	public void adiIni (Papel e) {
		NodoS x = new NodoS();
		x.setElem(e);
		
		if (esVacia()) {
			p = x;
			p.setSig(p);
		} else {
			NodoS r = p;
			while (r.getSig() != p)
				r = r.getSig();
			
			x.setSig(p);
			r.setSig(x);
			p = x;
		}
	}
	
	public void adiFin (Papel e) {
		NodoS x = new NodoS();
		x.setElem(e);
		
		if (esVacia()) {
			p = x;
			p.setSig(p);
		} else {
			NodoS r = p;
			while (r.getSig() != p)
				r = r.getSig();
			r.setSig(x);
			x.setSig(p);
		}
	}
	
	public NodoS eliIni () {
		NodoS x = p;
		if (!esVacia()) {
			if (nroElem() == 1) {
				p = null;
			} else {
				NodoS r = p;
				while (r.getSig() != p) {
					r = r.getSig();
				}
				p = p.getSig();
				r.setSig(p);
				
				x.setSig(x);
			}
		} else {
			System.out.println("LCS Vacia eliini");
		}
		return x;
	}
	
	public NodoS eliFin () {
		NodoS x = p;
		if (!esVacia()) {
			if (nroElem() == 1) {
				p = null;
			} else {
				NodoS r = p;
				while (x.getSig() != p) {
					r = x;
					x = x.getSig();
				}
				r.setSig(p);
				x.setSig(x);
			}
			
		} else {
			System.out.println("LCS vacia elifin");
		}
		return x;
	}
	
	public void llenar (int n) {
		for (int i = 1 ;i <= n ;i++) 
			adiFin(new Papel("A"+i, i));	
	}
	
	public void mostrar () {
		if (!esVacia()) {
			int tam = nroElem();
			NodoS r = p;
			for (int i = 0 ;i < tam ;i++) {
				System.out.println(r.getElem());
				r = r.getSig();
			}
			System.out.println();
		} else {
			System.out.println("LCS Vacia Mostrar");
		}
	}
	
	public NodoS getP() {
		return p;
	}

	public void setP(NodoS p) {
		this.p = p;
	}
	
}
