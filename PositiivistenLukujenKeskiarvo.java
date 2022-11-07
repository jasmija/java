
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int positiivisia = 0;
        int plukumaara = 0;
        
        while (true) {
            System.out.println();
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            if (luku > 0) {
                positiivisia = positiivisia + luku;
                plukumaara = plukumaara + 1;
            }
        }
        if (plukumaara > 0) {
            double keskiarvo = 1.0 * positiivisia / plukumaara;
            System.out.println(keskiarvo);
        } else {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
    }
}

        
    

    


    

        
         

        
        

    

