public class Autoteht�v� { //Luokan ilmentym� 
	
	private int nopeus;
	private String v�ri;
	private int vuosimalli;
	
	public Autoteht�v�(int nopeus, String v�ri) { //Konstruktori = sen avulla luodaan ilmentym� luokasta
		super();
		this.nopeus = nopeus;
		this.v�ri = v�ri;
		this.vuosimalli = 1992;
	}
	
	
	
	public Autoteht�v�(String v�ri) {
		super();
		this.v�ri = v�ri;
		this.nopeus = 100;
		this.vuosimalli = 1992;
	}



	public Autoteht�v�() {
		super();
		this.nopeus = 50;
		this.v�ri = "musta";
	}

	public int getNopeus() {
		return nopeus;
	}

	public void setNopeus(int nopeus) {
		this.nopeus = nopeus;
	}

	public String getV�ri() {
		return v�ri;
	}

	public void setV�ri(String v�ri) {
		this.v�ri = v�ri;
	}
	
	public int getVuosimalli() {
		return vuosimalli;
	}

	public void setVuosimalli(int vuosimalli) {
		this.vuosimalli = vuosimalli;
	}

	@Override
	public String toString() {
		return "Autoteht�v� [nopeus=" + nopeus + ", v�ri=" + v�ri + "]";
	}
	
}
