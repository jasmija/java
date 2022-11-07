
public class Pienin {

    public static int pienin(int luku1, int luku2) {
        int muuttuja = luku1;
        
        if (luku1 < luku2) {
            muuttuja = luku1;
        }else{ 
            muuttuja = luku2;
        }
        // kirjoita koodia tähän
        // älä tulosta metodin sisällä mitään
        // lopussa oltava komento return
        return muuttuja;
    }

    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
