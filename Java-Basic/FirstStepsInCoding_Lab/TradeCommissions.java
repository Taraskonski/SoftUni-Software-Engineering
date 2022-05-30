import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double comm = 0;

        if ((!city.equals("Sofia") && !city.equals("Varna") && !city.equals("Plovdiv")) || (sales < 0)) {
            System.out.println("error");
        } else if ("Sofia".equals(city)) {
            if (sales >= 0 && sales <= 500) {
                comm = sales * 0.05;
            } else if (sales > 500 && sales <= 1000) {
                comm = sales * 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                comm = sales * 0.08;
            } else if (sales > 10000) {
                comm = sales * 0.12;
            }
            System.out.printf("%.02f", comm);

        } else if ("Varna".equals(city)) {
            if (sales >= 0 && sales <= 500) {
                comm = sales * 0.045;
            } else if (sales > 500 && sales <= 1000) {
                comm = sales * 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                comm = sales * 0.10;
            } else if (sales > 10000) {
                comm = sales * 0.13;
            }
            System.out.printf("%.02f", comm);

        } else if ("Plovdiv".equals(city)) {
            if (sales >= 0 && sales <= 500) {
                comm = sales * 0.055;
            } else if (sales > 500 && sales <= 1000) {
                comm = sales * 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                comm = sales * 0.12;
            } else if (sales > 10000) {
                comm = sales * 0.145;
            }
            System.out.printf("%.02f", comm);
        } else {
            System.out.println("error");
        }
    }
}
