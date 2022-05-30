import java.util.Scanner;

public class PB08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());
        // area S = n * r^2
        double area = Math.PI * (Math.pow(r, 2));
        // perimeter P = 2 * n * r
        double perimeter = 2 * (Math.PI * r);

        System.out.printf("%.2f %n", area);
        System.out.printf("%.2f", perimeter);
    }
}
