package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());

        double area = printRectangleArea(width, height);
        System.out.printf("%.0f",area);
    }
    private static double printRectangleArea (double width, double height) {
        return width * height;
    }
}
