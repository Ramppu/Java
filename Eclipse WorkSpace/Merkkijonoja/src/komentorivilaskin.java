import java.util.Scanner;
 
class Komentorivilaskin {
  public static void main(String [] args) {
  int pituus = args.length;
 
  if (pituus < 3)
  System.out.println("Et antanut mitään laskutoimitusta!");
  else if (pituus % 2 == 0)
  System.out.println("Annoit virheellisen määrän komentoriviparametreja.");
  else {
  Laskin laskuri = new Laskin();
  laskuri.laske(args);
  }
  }
} 

class Laskin {
	String [] args;
	public void laske(String []args) {
	int pituus = args.length;	
	int tulos = 0;
		
		System.out.print("Laskun "); 
		for(int x = 0;x<pituus;x++) {
			if( x % 2 == 0) {
				int i =Integer.parseInt(args[x]);
				tulos += i;
				System.out.print(i +  " ");
				System.out.print(" TULOS ON :: " + tulos + " ::");
			}
				else {
					if(args[x].equals('+')) {
					System.out.print(args[x] + " ");
					int j = Integer.parseInt(args[x-1]);
					tulos += j;
					}
					else {
					System.out.print(args[x] + " ");
					int j = Integer.parseInt(args[x-1]);
					tulos -= j;
					}
				}
		}
		System.out.print("tulos on " + tulos);
	}

}