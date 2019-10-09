package olioidenLkm;

public class BensaMittari {

		static double x;
		static double Yv;
		static double Yk;
		static double Di;
		
		public BensaMittari() {
		
		}
		
		public void tankkaa(int vastaus, double m‰‰r‰) {
			switch (vastaus) {
			case 1:
				Yv += m‰‰r‰;
				x += m‰‰r‰;
				break;
				
			case 2:
				Yk += m‰‰r‰;
				x += m‰‰r‰;
				break;
				
			case 3:
				Di += m‰‰r‰;
				x += m‰‰r‰;
				break;			
			}
		}
		
		public static void tankattuYhteens‰() {
			System.out.println("Tankattu kaikkia yhteens‰: " + Yv);
		}
		
		public static void tankattuYhteens‰95() {
			System.out.println("Tankattu 95-oktaavista yhteens‰: " + x);
		}
		
		public static void tankattuYhteens‰98() {
			System.out.print("Tankattu 98-oktaavista yhteens‰: " + x);
		}
		
		public static void tankattuYhteens‰Di() {
			System.out.println("Tankattu dieseli‰ yhteens‰: " + x);
		}
}
