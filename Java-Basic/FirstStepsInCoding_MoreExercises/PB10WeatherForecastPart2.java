import java.util.Scanner;

public class PB10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = Double.parseDouble(sc.nextLine());

        if (celsius >= 26.00 && celsius <= 35.00) {
            System.out.println("Hot");
        } if (celsius <= 25.9 && celsius >= 20.1) {
            System.out.println("Warm");
        } if (celsius <= 20 && celsius >= 15.00) {
            System.out.println("Mild");
        } if (celsius <= 14.9 && celsius >= 12) {
            System.out.println("Cool");
        } if (celsius <= 11.9 && celsius >= 5) {
            System.out.println("Cold");
        } else if (celsius < 5 || celsius > 35) {
            System.out.println("unknown");
        }
    }
}
