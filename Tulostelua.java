
public class Tulostelua {

    public static void main(String[] args) {
        tulostaTahtia(5);
        tulostaTahtia(3);
        tulostaTahtia(9);

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        int lopeta = 1;
        while (lopeta <= maara) {
            System.out.print("*"); 
            lopeta++; 
        }
        
        System.out.println("");
        
        // tehtävän ensimmäinen osa
    }

    public static void tulostaNelio(int sivunpituus) {
        for (int i = 0; i < sivunpituus; i++) {
            tulostaTahtia(sivunpituus);
        }
        
        
            
        // tehtävän toinen osa
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        for (int i = 0; i < korkeus; i++) {
            tulostaTahtia(leveys);
        }
        // tehtävän kolmas osa
    }

    public static void tulostaKolmio(int koko) {
        for (int i = 0; i <= koko; i++) {
            tulostaTahtia(i);
        }
        // tehtävän neljäs osa
    }
}
