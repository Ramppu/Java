
public class Octopus extends Fish {
	private int tentacles;
	
	

	public Octopus() {
		super();
		this.tentacles = 8;
		setSpecies("Octopus");
	}

	public int getTentacles() {
		return tentacles;
	}

	public void setTentacles(int tentacles) {
		this.tentacles = tentacles;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nTentacles: " + tentacles;
	}
	
public void releaseInk() {
	System.out.println("Puff, Ink released.");
}
	
}
