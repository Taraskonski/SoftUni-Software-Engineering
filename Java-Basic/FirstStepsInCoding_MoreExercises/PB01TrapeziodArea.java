import java.util.Scanner;

public class PB01TrapeziodArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b1 = Double.parseDouble(sc.nextLine());
        double b2 = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        double trapezoidArea = (b1 + b2) * h / 2.0;

        System.out.printf("%.2f", trapezoidArea);
    }
}
