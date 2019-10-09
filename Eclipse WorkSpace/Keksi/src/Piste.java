
public class Piste {
	private int x;
	private int  y;
	
	public Piste(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (x < 0) {
		this.x = 0;
		}
		else if (x > 100) {
			this.x = 100;
		}
		else {
			this.x = x;
		}
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if (y < 0) {
			this.y = 0;
			}
			else if (y > 100) {
				this.y = 100;
			}
			else {
				this.y = y;
			}
		
	}
	@Override
	public String toString() {
		return "Piste [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
}
