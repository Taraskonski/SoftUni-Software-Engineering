import java.util.Scanner;

public class ConStAdv06TruckDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        double km = Double.parseDouble(sc.nextLine());

        double salary = 0;

        if (season.equals("Spring") && km <= 5000) {
            salary = ((km * 0.75) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Spring") && km > 5000 && km <= 10000) {
            salary = ((km * 0.95) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Spring") && km > 10000 && km <= 20000) {
            salary = ((km * 1.45) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Summer") && km <= 5000) {
            salary = ((km * 0.90) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Summer") && km > 5000 && km <= 10000) {
            salary = ((km * 1.10) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Summer") && km > 10000 && km <= 20000) {
            salary = ((km * 1.45) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Winter") && km <= 5000) {
            salary = ((km * 1.05) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Winter") && km > 5000 && km <= 10000) {
            salary = ((km * 1.25) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Winter") && km > 10000 && km <= 20000) {
            salary = ((km * 1.45) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Autumn") && km <= 5000) {
            salary = ((km * 0.75) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Autumn") && km > 5000 && km <= 10000) {
            salary = ((km * 0.95) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
        if (season.equals("Autumn") && km > 10000 && km <= 20000) {
            salary = ((km * 1.45) * 4) * 0.90;
            System.out.printf("%.2f", salary);
        }
    }
}