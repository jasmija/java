
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            int potenssi = luku * luku;
            
            if (luku < 0) {
                System.out.println("Epäkelpo luku");
            }
            if (luku > 0) {
                System.out.println(potenssi);
            }
            if (luku == 0) {
                break;
            }
                
        }
    }
}
