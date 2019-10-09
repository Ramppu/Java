
public class Aquarium {

	public static void main(String[] args) {
		
		Fish Frank = new Fish("Pufferfish",3.56);
		Octopus Otto = new Octopus();
		LungFish Larry = new LungFish();
		
		Otto.setWeight(6.54);
		Larry.setWeight(8.42);
		
		System.out.println("School size: " +  Otto.getSchoolSize());
		ok();
		System.out.println(Otto);
		ok();
		System.out.println(Frank);
		ok();
		System.out.println(Larry);
		ok();
		Larry.breathe();
		Otto.releaseInk();

	}

	public static void ok() {
		System.out.println("+-----------------------------------------------+");
	}
	
}

