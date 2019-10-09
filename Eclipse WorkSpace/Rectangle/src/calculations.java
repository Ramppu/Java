import java.lang.*;
public class calculations {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Rectangle rec2 = new Rectangle(2.0f);	
		Rectangle rec3 = new Rectangle(2.5f, 2.3f);
		
		rec.setLength(12.5f);
		rec.setWidth(10.1f);
		
		rec2.setWidth(2.5f);
		
		System.out.println(rec.toString());
		System.out.println("Area of the object Rec is: " + Math.round(rec.Area() ));
		System.out.println("The perimeter of the object Rec is: " + Math.round(rec.Perimeter() ));
		
		System.out.println("\n" +rec2.toString());
		System.out.println("Area of the object Rec2 is: " + Math.round(rec2.Area() ));
		System.out.println("The perimeter of the object Rec2 is: " + Math.round(rec2.Perimeter() ));
		
		System.out.println("\n" +rec2.toString());
		System.out.println("Area of the object Rec3 is: " + Math.round(rec3.Area() ));
		System.out.println("The perimeter of the object Rec3 is: " + Math.round(rec3.Perimeter() ));
	}
}
