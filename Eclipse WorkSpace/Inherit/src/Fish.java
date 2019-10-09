
public class Fish {
	static int schoolSize;
	private String species;
	private double weight;
	
	
	public Fish() {
		super();
		schoolSize ++;
	}
	public Fish(String species, double weight) {
		super();
		this.species = species;
		this.weight = weight;
		schoolSize ++;
	}
	
	public Fish(double weight) {
		super();
		this.weight = weight;
		schoolSize ++;
		
		
	}
	public static int getSchoolSize() {
		return schoolSize;
	}
	public static void setSchoolSize(int schoolSize) {
		Fish.schoolSize = schoolSize;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Species: " + species + "\nWeight; " + weight;
	}
	
	
	
}
