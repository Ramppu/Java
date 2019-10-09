import java.util.Scanner;
public class Merkkijonoja {

	public static void main(String[] args) {
		String merkkijono, uusiMerkkijono;
		Scanner lukija = new Scanner(System.in);
		
		Tulostaja tulostusOlio = new Tulostaja();
		
		System.out.print("Anna merkkijono: ");
		merkkijono = lukija.nextLine();
		
		uusiMerkkijono = tulostusOlio.isotPienet(merkkijono);
		tulostusOlio.takaperinHarva(uusiMerkkijono);

	}
}

class Tulostaja {
String merkkijono;
String uusiMerkkijono;
	
	public String isotPienet(String merkkijono) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Minkälaisina kirjaimina haluat merkkijonon (isot/pienet): ");
		String str = reader.nextLine();
	
		if(str=="isot"){
			String lower = merkkijono.toLowerCase();
			return lower;
		}
		
		else{
			String upper = merkkijono.toUpperCase();
			return upper;
		}				
	}
	
	public void takaperinHarva(String uusiMerkkijono) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Miten haluat merkkijonon tulostettavan (takaperin/harvana): ");
		String str1 = reader.nextLine();
		
		if(str1 == "takaperin") { 
			System.out.print("Tässä on merkkijonosikkk: ");
			for(int x = uusiMerkkijono.length();x>0;x--) {
				System.out.print(uusiMerkkijono.charAt(x-1));
			}
		}
		else {
			System.out.print("Tässä on merkkijonosi: ");
			for(int x = 0;x<uusiMerkkijono.length();x++) {
				System.out.print(uusiMerkkijono.charAt(x) + " ");
			}
		}	
	}

}