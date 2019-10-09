import java.util.Scanner;
	
public class Piste {
	
	public void piste() {
		this.x = 0;	
		this.y = 0;
		
	}

	private int y;
	private int x;
	
		public int getX(){
			return this.x;
		}
		
		public int setX(int newX){
			return this.x = newX;
		}

		
		public int getY(){ 
			return this.y;
		}
		
		public int setY(int newY){
			return this.y = newY;
		}
		
		public int m‰‰rit‰X (int x) {
			 if(x < 0) {
		     return setX(0); 
		     }
		     else if(x > 100) {
		        return setX(100);
		     }
		        else {
		        	return setX(x);
		        }
		}
		
		public int m‰‰rit‰Y (int y) {
			 if(y < 0) {
		     return setY(0); 
		     }
		     else if(y > 100) {
		        return setY(100);
		     }
		        else {
		        	return setY(y);
		        }
		}


		 public void siirr‰(int x, int y) {
			
		 }



    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Piste piste = new Piste();
        System.out.println("Anna koordinaattien alkuarvot:");
        System.out.print("x: ");
        int x = lukija.nextInt();
        x = piste.m‰‰rit‰X(x);
        
        System.out.print("y: ");
        int y = lukija.nextInt();
        y = piste.m‰‰rit‰Y(y);
         
        System.out.println("Pisteen paikka nyt: " + piste.getX() +"," + piste.getY());
        System.out.println("Anna x- ja y-koordinaattien muutokset");
        System.out.print("x: ");
        x = lukija.nextInt();
        System.out.print("y: ");
        y = lukija.nextInt();
        
        piste.siirr‰(x, y);
        System.out.println("Pisteen paikka nyt: " + piste);
        
        
    
    }
}





