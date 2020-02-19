import java.util.Random;

public class Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autoteht‰v‰ A = new Autoteht‰v‰();
		A.setV‰ri("Punainen");
		A.setNopeus(100);
		
		System.out.println(A.toString());
		
		//Kun luot ilmentymi‰ luokista, sinun ei tarvitse en‰‰ koskea konstruktoriin tai
		//siihen luokkaan periaatteessa ollenkaan. Eli pysy t‰ll‰ sivulla ja tee muutokset
		//t‰ll‰ sivulla. 
		
		Autoteht‰v‰ B = new Autoteht‰v‰(80, "sininen");
		System.out.println(B.getNopeus() + B.getV‰ri());
		
		Autoteht‰v‰ C = new Autoteht‰v‰();
		System.out.println(C.toString());
		
		String [] taulu = {"punainen","Keltainen","Sininen"};
		
		
		for (int x = 0; x < 3; x++) {
			int nmbr = new Random().nextInt(taulu.length);
			switch(x) {
				case 0:
					A.setV‰ri(taulu[nmbr]);
					break;
				case 1:
					B.setV‰ri(taulu[nmbr]);
					break;
				case 2:
					C.setV‰ri(taulu[nmbr]);
					break;
				
			}
		}
		System.out.print(C + "\n" + A + "\n" + B);
	}
}
