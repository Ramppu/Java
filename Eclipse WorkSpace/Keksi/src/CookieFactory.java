import java.util.Scanner;
public class CookieFactory {
	// The Cookie Factory works here 
	public static void main (String [] args) {
		Cookie c = new Cookie();
		Cookie c2 = new Cookie("Marabou");
		Cookie c3 = new Cookie("Digestive", 25);
		Scanner reader = new Scanner(System.in);
		int choice = 0;
		
		c.setMark("Filippinos");
		c.setWeight(30);
		
		c2.setWeight(40);
		
		System.out.println(c.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		int cookie = chooseCookie();
		
		if(cookie == 1) {
			System.out.println("You've Chosen the" + c.getMark() + " Cookie.");
		}
		else if (cookie == 2) {
			System.out.println("You've Chosen the " + c2.getMark() + " Cookie.");
		}
		else {
			System.out.println("You've Chosen the" + c3.getMark() + " Cookie.");
		}
		
		baitAndSwitch (choice, cookie, c, c2, c3);
			
	}
	//This method Chooses the cookie
	public static int chooseCookie() {
	Scanner reader = new Scanner(System.in);
	int choice = 0;
				
	while(choice != 3 && choice != 2 && choice != 1) {
		System.out.print("Which Cookie do you want to eat? (1-3): ");
		choice = reader.nextInt();
		if(choice  != 3 && choice != 2 && choice != 1) {
			System.out.println("Invalid input, Please choose a number between 1 and 3 !");
		}
	}
	return choice;
}		
	//Q method is responsible for the amount of bites person takes out of the cookie
	public static int Q() {
		Scanner reader = new Scanner(System.in);
		int choice = 0;
		while(choice != 3 && choice != 2 && choice != 1) {
		System.out.print("How many bites do you want to take?\n1:\n2:\nEat the whole cookie?: ");
		choice = reader.nextInt();
			if(choice  != 3 && choice != 2 && choice != 1) {
				System.out.println("Invalid input, Please choose a number between 1 & 3 !");
			}
		}
			return choice;
}
	//Bait and switch is the final frontier of this mess
	public static void baitAndSwitch (int choice, int cookie, Cookie c, Cookie c2, Cookie c3) {
		choice = Q();
		switch (choice) {
		case 1:
			if (cookie == 1) {
				c.Bite();
				Sentence(cookie, c, c2, c3);
				break;
			}
			else if (cookie == 2) {
				c2.Bite();
				Sentence(cookie, c, c2, c3);
				break;
			}
			else {
				c3.Bite();
				Sentence(cookie, c, c2, c3);
				break;
			}
				
		case 2:
			if (cookie == 1) {
				c.Bite();
				c.Bite();
				Sentence(cookie, c, c2, c3);
				break;
			}
			else if (cookie == 2) {
				c2.Bite();
				c2.Bite();
				Sentence(cookie, c, c2, c3);
				break;
			}
			else {
				c3.Bite();
				c3.Bite();
				Sentence(cookie, c, c2, c3);
				break;
			}
		case 3:
			if (cookie == 1) {
				c.setWeight(0);
				Sentence(cookie, c, c2, c3);
				break;
			}
			else if (cookie == 2) {
				c2.setWeight(0);
				Sentence(cookie, c, c2, c3);
				break;
			}
			else {
				c3.setWeight(0);
				Sentence(cookie, c, c2, c3);
				break;
			}
		}
}
	//Sentence prints out the final line of text to the screen
	public static void Sentence (int cookie, Cookie c, Cookie c2, Cookie c3) {
		switch (cookie) {
		case 1:
			if(c.getWeight() == 0) {
			System.out.println( c.getMark() + " is gone :(");
			break;
			}
			else {
				System.out.println( c.getMark() + "'s Weight is now " +c.getWeight() + "g");
				break;
			}
		case 2:
			if(c2.getWeight() == 0) {
				System.out.println( c2.getMark() + " is gone :(");
				break;
				}
				else {
					System.out.println( c2.getMark() + "'s Weight is now " +c2.getWeight() + "g");
					break;
				}
		case 3:
			if(c3.getWeight() == 0) {
				System.out.println( c3.getMark() + " is gone :(");
				break;
				}
				else {
					System.out.println( c3.getMark() + "'s Weight is now " +c3.getWeight() + "g");
					break;
				}
		}
	}
}

