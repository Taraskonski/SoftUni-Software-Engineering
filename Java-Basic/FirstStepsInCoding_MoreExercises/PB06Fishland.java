import java.util.Scanner;

public class PB06Fishland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mackerel = Double.parseDouble(sc.nextLine());
        double sprout = Double.parseDouble(sc.nextLine());
        double palamud = Double.parseDouble(sc.nextLine());
        double scad = Double.parseDouble(sc.nextLine());
        double shells = Double.parseDouble(sc.nextLine());

        double pricePalamudPerKilo = mackerel + (mackerel * 0.60);
        double pricePalamud = palamud * pricePalamudPerKilo;
        double priceScadPerKilo = sprout + (sprout * 0.80);
        double priceScad = scad * priceScadPerKilo;
        double priceShells = shells * 7.50;
        double total = pricePalamud + priceScad + priceShells;

        System.out.printf("%.2f", total);
    }
}
