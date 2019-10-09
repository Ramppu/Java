package olioidenLkm;
import java.util.Scanner;

public class BensaMittarinTestaus {
    public static void main(String args[]) {   
        int vastaus = 1;
        boolean arvoSopiva = true;
        BensaMittari mittari = new BensaMittari();

        while (arvoSopiva) {
            Scanner lukija = new Scanner(System.in);
            
            System.out.print("Mitä haluat tankata: 1=95, 2=98, 3=Diesel " + 
                "(lopetus muilla luvuilla): ");
            vastaus = lukija.nextInt();
           
            if(vastaus >= 1 && vastaus <= 3) {
                System.out.print("Paljonko haluat tankata: ");
                double määrä = lukija.nextDouble();
                mittari.tankkaa(vastaus, määrä);
            } else {
                arvoSopiva = false;
            }
        }
       
        BensaMittari.tankattuYhteensä();
        BensaMittari.tankattuYhteensä95();
        BensaMittari.tankattuYhteensä98();
        BensaMittari.tankattuYhteensäDi();
   }
}