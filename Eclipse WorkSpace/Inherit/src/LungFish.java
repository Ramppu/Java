
public class LungFish extends Fish {
	private int lobefin;
	

	public LungFish() {
		super();
		this.lobefin = 4;
		setSpecies("Sacropterygii");
	}

	public int getLobefin() {
		return lobefin;
	}

	public void setLobefin(int lobefin) {
		this.lobefin = lobefin;
	}
	
	@Override
	public String toString() {
		return  super.toString() + "\nLobefins: " + lobefin;
	}
	public void breathe() {
		System.out.println("Breathe bois.");
	}
	
}
