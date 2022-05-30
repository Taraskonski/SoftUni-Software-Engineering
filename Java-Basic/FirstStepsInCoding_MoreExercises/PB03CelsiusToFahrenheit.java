import java.util.Scanner;

public class PB03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c = Double.parseDouble(sc.nextLine());
        double f = c * 1.8 + 32;  //T (° F) = T (° C) × 1,8 + 32

        System.out.printf("%.2f", f);
    }
}