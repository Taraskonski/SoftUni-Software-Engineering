import java.util.Scanner;

public class ConSt04TransportPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = Double.parseDouble(sc.nextLine());
        String dayOrNight = sc.nextLine();

        double taxiDay = 0;
        double taxiNight = 0;
        double bus = 0;
        double train = 0;

        if (km < 20 && dayOrNight.equals("day")) {
            taxiDay = (70 + (79 * km)) / 100;
            System.out.printf("%.2f", taxiDay);
        } else if (km < 20 && dayOrNight.equals("night")) {
            taxiNight = (70 + (90 * km)) / 100;
            System.out.printf("%.2f", taxiNight);
        } else if (km >= 20 && km < 100) {
            bus = (9 * km) / 100;
            System.out.printf("%.2f", bus);
        } else if (km >= 100) {
            train = (6 * km) / 100;
            System.out.printf("%.2f", train);
        }
    }
}
