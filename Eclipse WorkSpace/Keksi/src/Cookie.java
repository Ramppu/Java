
public class Cookie {
	private String  mark;
	private int weight;
		
	// Constructors
	public Cookie() {
		super();
		this.mark = "No Brand";
		this.weight = 1;
	}
	public Cookie(String mark) {
		super();
		this.mark = mark;
		this.weight = 1;
	}
	public Cookie(String mark, int weight) {
		super();
		this.mark = mark;
		this.weight = weight;
	}	
	
	// Getters And Setters
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Brand: " + mark + "\nWeight: " + weight + " g";
	}	
	public void Bite () {
		this.weight -=5;
	}
}
