public class Autotehtävä { //Luokan ilmentymä 
	
	private int nopeus;
	private String väri;
	private int vuosimalli;
	
	public Autotehtävä(int nopeus, String väri) { //Konstruktori = sen avulla luodaan ilmentymä luokasta
		super();
		this.nopeus = nopeus;
		this.väri = väri;
		this.vuosimalli = 1992;
	}
	
	
	
	public Autotehtävä(String väri) {
		super();
		this.väri = väri;
		this.nopeus = 100;
		this.vuosimalli = 1992;
	}



	public Autotehtävä() {
		super();
		this.nopeus = 50;
		this.väri = "musta";
	}

	public int getNopeus() {
		return nopeus;
	}

	public void setNopeus(int nopeus) {
		this.nopeus = nopeus;
	}

	public String getVäri() {
		return väri;
	}

	public void setVäri(String väri) {
		this.väri = väri;
	}
	
	public int getVuosimalli() {
		return vuosimalli;
	}

	public void setVuosimalli(int vuosimalli) {
		this.vuosimalli = vuosimalli;
	}

	@Override
	public String toString() {
		return "Autotehtävä [nopeus=" + nopeus + ", väri=" + väri + "]";
	}
	
}
