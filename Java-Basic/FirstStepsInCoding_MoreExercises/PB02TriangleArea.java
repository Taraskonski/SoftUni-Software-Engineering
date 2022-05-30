import java.util.Scanner;

public class PB02TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        double triangleArea = (a * h) / 2.0;

        System.out.printf("%.2f", triangleArea);
    }
}
