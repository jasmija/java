
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        
        int tulo = luku * -1;
        if (luku < 0) {
            System.out.println(tulo);
        } else {
            System.out.println(luku);
        }
    }
}
    

