import java.util.Scanner;

public class ConSt03Harvest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        double z = Double.parseDouble(sc.nextLine());
        double workers = Double.parseDouble(sc.nextLine());
        double totalGrape = x * y;
        double totalWine = (totalGrape * 0.40) / 2.5;

        if (totalWine >= z) {
            double wineLeft = totalWine - z;
            double winePerWorker = wineLeft / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(totalWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(winePerWorker));
        } else {
            double wineDeficit = z - totalWine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineDeficit));
        }
    }
}
