
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        
       
        System.out.println("Syötä luvut: ");
        
        int summa = 0;
        int lukumaara = 0;
        int parillinen = 0;
        int pariton = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == -1) {
                break;
            }
            if (luku == luku) {
                summa = summa + luku;
            }
            if (luku != -1) {
                lukumaara = lukumaara + 1;
            }
            if (luku % 2 == 0) {
                parillinen = parillinen + 1;
            }
            if (luku % 2 != 0) {
                pariton = pariton + 1;
            }
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukumaara);
        double keskiarvo = 1.0 * summa / lukumaara;
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parillinen);
        System.out.println("Parittomia: " + pariton);
    }  
}
        

    

        

    

