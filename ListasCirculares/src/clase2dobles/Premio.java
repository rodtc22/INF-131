package clase2dobles;

public class Premio {
	
	private String merito;
	private int monto;
	
	public Premio() {
		this.merito = "nobel";
		this.monto = 1234;
	}
	
	public Premio(String merito, int monto) {
		this.merito = merito;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Premio [merito=" + merito + ", monto=" + monto + "]";
	}

	public String getMerito() {
		return merito;
	}

	public void setMerito(String merito) {
		this.merito = merito;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	
	
}
