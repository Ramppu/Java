package beverageMachine;
import java.util.*;

public class Beverage {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); //Scanner object
		Machine  machine = new Machine(); // Machine object
		int choice = 1; // Choice value is 1 because it is initiating the loop
		
		
		while(choice >= 1 && choice <= 3) {
			int monkaS =  (int)(Math.random() * 100+1);	// Re-defined at the start of every loop
			boolean scam = machine.rng(monkaS);			// Re-defined at the start of every loop
			
			System.out.println("*******Beverage Machine*******\n");
			System.out.println("1. Coffee\n2. Tea\n3. Hot Chocolate\n4. Quit\n");
			System.out.println("******************************");
			System.out.print("Choose one option: ");
			choice = reader.nextInt();	
			
			if (scam == false) {
				switch (choice) {
					
				case 1:
					machine.checkCoffee(); // If beverage < 10, print out error();
					break;
					
				case 2:
					machine.checkTea(); // If beverage < 10, print out error();
					break;
					
				case 3:
					machine.checkHotChocolate(); // If beverage < 10, print out error();
					break;
					
				case 4:
					System.out.print("Thank You for Using BeverageMachine!");
					break;
					
				default:
					System.out.println("Invalid Input, try again."); //Giving an invalid input breaks the loop
					break;
				}
			}
			else {
				System.out.println("Scammed, thank you for the money!"); // if scam == true, This line overrides default case
			}
		}
		reader.close();
	}	
	}
	

