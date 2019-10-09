
public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	//CONSTRUCTORS
	public Rectangle() {
		super();
	}
	
	public Rectangle(float length) {
		super();
		this.length = length;
		this.width = 2.5f;
	}
	
	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	//GETTERS AND SETTERS
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle Length: " + length + " || Width: " + width;
	}
	
	public float Area() {
		return (getLength() * getWidth() );
	}
	
	public float Perimeter() {
		return ( (getLength() * 2) + (getWidth() * 2) );
	}
}

