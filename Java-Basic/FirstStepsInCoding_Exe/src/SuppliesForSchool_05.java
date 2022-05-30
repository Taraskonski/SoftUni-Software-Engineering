import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = Integer.parseInt(sc.nextLine());
        int markers = Integer.parseInt(sc.nextLine());
        int deter = Integer.parseInt(sc.nextLine());
        double discount = Double.parseDouble(sc.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double deterPrice = deter * 1.20;
        double allSum = pensPrice + markersPrice + deterPrice;
        double total = allSum - (allSum * (discount / 100));

        System.out.println(total);
    }
}
