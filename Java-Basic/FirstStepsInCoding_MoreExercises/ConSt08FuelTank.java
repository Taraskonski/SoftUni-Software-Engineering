import java.util.Locale;
import java.util.Scanner;

public class ConSt08FuelTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fuel = sc.nextLine();
        double litters = Double.parseDouble(sc.nextLine());

        if (!fuel.equals("Diesel") && !fuel.equals("Gasoline") && !fuel.equals("Gas")) {
            System.out.println("Invalid fuel!");
        } else if (fuel.equals("Diesel") && litters < 25) {
            System.out.printf("Fill your tank with %s!", fuel.toLowerCase(Locale.ROOT));
        } else if (fuel.equals("Gasoline") && litters < 25) {
            System.out.printf("Fill your tank with %s!", fuel.toLowerCase(Locale.ROOT));
        } else if (fuel.equals("Gas") && litters < 25) {
            System.out.printf("Fill your tank with %s!", fuel.toLowerCase(Locale.ROOT));
        } else if (litters >= 25) {
            System.out.printf("You have enough %s.", fuel.toLowerCase(Locale.ROOT));
        }
    }
}