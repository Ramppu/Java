package beverageMachine;
public class Machine{
	//Beverage class' variables;
	private int tea;
	private int coffee;
	private int hotChocolate;	

	
	//CONSTRUCTORS
	public Machine() {
		super();
		this.tea = 50;
		this.coffee = 50;
		this.hotChocolate = 50;
	}
	
	public Machine(int tea, int coffee, int hotChocolate) {
		super();
		this.tea = tea;
		this.coffee = coffee;
		this.hotChocolate = hotChocolate;
	}

	//GETTERS AND SETTERS
	public int getTea() {
		return tea;
	}
	public void setTea(int tea) {
		this.tea = tea;
	}
	
	public int getCoffee() {
		return coffee;
	}
	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	public int getHotChocolate() {
		return hotChocolate;
	}
	public void setHotChocolate(int hotChocolate) {
		this.hotChocolate = hotChocolate;
	}

	@Override // TO STRING
	public String toString() {
		return "Machine [tea=" + tea + ", coffee=" + coffee + ", hotChocolate=" + hotChocolate + "]";
	}
	
	//These methods subtract the given value from the beverages
	public void makeCoffee() {
		this.coffee -= 10;
		System.out.println("Please wait a moment while your coffee is being made...\n" + getCoffee() + " units of coffee left.");	
	}
	
	public void makeHotChocolate() {
		this.hotChocolate -= 10;
		System.out.println("Please wait a moment while your hot chocolate is being made...\n" + getHotChocolate() + " units of hot chocolate left.");	
	}
	
	public void makeTea() {
		this.tea -= 10;
		System.out.println("Please wait a moment while your tea is being made...\n" + getTea() + " units of tea left.");	
	}
	
	//Error print if ingredients are not sufficient for the makeX methods
	public void error() {
		System.out.println("Not Enough Ingredients. Try something else");
	}
	
	
	//Checks if beverages can be made, If the value of beverage is less than 10, it gives an error, otherwise it makes the beverage
	public void checkTea() {
		if(getTea() < 10) {
			error();
		}
		else {
			makeTea();
		}
	}
	
	public void checkCoffee() {
		if(getCoffee() < 10) {
			error();
		}
		else {
			makeCoffee();
		}
	}
	
	public void checkHotChocolate() {
		if(getHotChocolate() < 10) {
			error();
		}
		else {
			makeHotChocolate();
		}
	}
	
	
	//Returns a value to the 'Scam'  variable
	public boolean rng(int monkaS) {
		if (monkaS <= 25) {
			return true;
		}
		else {
			return false;
		}
}
}

