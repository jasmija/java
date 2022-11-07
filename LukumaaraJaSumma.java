
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int lukumaara = 0;
        
        while (true) {
            System.out.println("Syötä luku ");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            
            if (luku == luku) {
                summa = summa + luku;
            }
            
            if (luku == luku) {
                lukumaara = lukumaara + 1;
            }
        }
        System.out.println("Lukuja yhteensä " + lukumaara);
        System.out.println("Lukujen summa " + summa);
    }
}
    





 


