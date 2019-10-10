package matikkaTest;

import java.util.Scanner;

public class Matikkaa {

	public static int summa(int eka, int toka) {
		return eka + toka;
	}
	public static double potenssi(int eka, int toka) {
		return Math.pow(eka, toka);
	}
	public static boolean biggerThan(int eka, int toka) {
		if(eka > toka) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int area(int pituus, int leveys) {
		if(pituus < 0 || pituus < 0) {
			return 0;
		}
		else {
			return (pituus * leveys);
		}
	}

	
	public static void main(String[] args) {
		int[] taulu = {1,4,5,6,7};

		System.out.println( Matikkaa.summa(2, 3) );
		System.out.println( Matikkaa.potenssi(4, 2) );
		System.out.println(Matikkaa.löytyyköLuku(taulu, 4));
		

	
		
	}
	
	public static boolean löytyyköLuku(int[] taulu, int luku) {
	    for (int i = 0; i < taulu.length; i++) {
	        if (taulu[i] == luku)
	            return true;
	    }
	    return false;
	}

}

