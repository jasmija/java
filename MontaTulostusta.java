
import java.util.Scanner;

public class MontaTulostusta {

    public static void main(String[] args) {
        // kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka monta?");
        int luku = Integer.valueOf(lukija.nextLine());
        int i = 0;
        
        while (i < luku) {
            i++;
            tulostaTeksti();
          
        }
    }

    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");
        
    // kirjoita koodia tähän
    }
}
    
