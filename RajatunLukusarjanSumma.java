
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen:");
        int ekaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int tokaluku = Integer.valueOf(lukija.nextLine());
       
        int tulos = 0;
        int alku = ekaluku;
        int loppu = tokaluku;
        for(int i = alku; i <= loppu; i++) {
            tulos += i;
        }
        System.out.println("Summa on " + tulos); 
    }
}


    

