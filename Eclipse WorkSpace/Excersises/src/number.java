import java.util.Arrays;
import java.util.Scanner;

public class number {
	
	public static int[] numbers() {		
		Scanner input = new Scanner (System.in);
		int[] nmbr = new int[3];
		
			for(int x=0;x<3;x++) {
			
				System.out.print("Please give out a number: ");
				int number = input.nextInt();
				nmbr[x] = number;
				
			}
			    input.close();
				return nmbr;
	}

	public static void main(String[] args) {
		
		int[] list = numbers();
		Arrays.sort(list);
		System.out.println("Smallest value in array is " + (double)list[0]);
	}

}
