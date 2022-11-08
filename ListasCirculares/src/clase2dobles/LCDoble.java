package clase2dobles;

public class LCDoble {
	
	private NodoD p;
	
	public LCDoble() {
		p = null;
	}
	
	public boolean esVacia() {
		return p == null;
	}
	
	public int nroElem () {
		int cnt = 0;
		if (!esVacia()) {
			NodoD r = p;
			cnt = 1;
			while (r.getSig() != p) {
				cnt++;
				r = r.getSig();
			}
		}
		return cnt;
	}
	
	public void adiIni (Premio e) {
		NodoD x = new NodoD();
		x.setElem(e);
		x.setSig(x); x.setAnt(x);
		
		if (esVacia()) {
			p = x;
		} else {
			NodoD ult = p.getAnt();
			ult.setSig(x);
			x.setAnt(ult);
			x.setSig(p);
			p.setAnt(x);
			
			p = x;
		}
	}
	
	public void adiFin (Premio e) {
		NodoD x =new NodoD();
		x.setElem(e);
		x.setSig(x); x.setAnt(x);
		
		if (esVacia()) {
			p = x;
		} else {
			NodoD ult = p.getAnt();
			ult.setSig(x);
			x.setAnt(ult);
			x.setSig(p); 
			p.setAnt(x);
		}
	}
	
	public NodoD eliIni () {
		NodoD x = p;
		if (!esVacia()) {
			if (nroElem() == 1) {
				p = null;
			} else {
				NodoD ult = p.getAnt();
				p = p.getSig();
				
				ult.setSig(p);
				p.setAnt(ult);
				
				x.setAnt(x); x.setSig(x);
			}
		} else {
			System.out.println("LCDoble vacia eliini");
		}
		return x;
	}
	
	public NodoD eliFin () {
		NodoD x = p;
		if (!esVacia()) {
			if (nroElem() == 1) {
				p = null;
			} else {
				x = p.getAnt();
				NodoD ult = x.getAnt();
				ult.setSig(p);
				p.setAnt(ult);
				
				x.setAnt(x); x.setSig(x);
			}
		} else {
			System.out.println("LCDoble vacia elifin");
		}
		return x;
	}
	
	public void llenar (int n) {
		for (int i = 1 ;i <= n; i++) 
			adiFin(new Premio("maya"+i, i));
	}
	
	public void mostrar () {
		if (!esVacia()) {
			int tam = nroElem();
			NodoD r = p;
			for (int i = 0 ;i < tam ;i++) {
				System.out.println(r.getElem());
				r = r.getSig();
			}
			System.out.println();
		} else {
			System.out.println("LCDoble vacia mostrar");
		}
	}

	public NodoD getP() {
		return p;
	}

	public void setP(NodoD p) {
		this.p = p;
	}
	
	
	
}
