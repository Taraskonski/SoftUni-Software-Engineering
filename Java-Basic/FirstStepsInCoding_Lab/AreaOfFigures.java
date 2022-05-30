import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;

        switch (figure){
            case "square":
                double squareSide = Double.parseDouble(scanner.nextLine());
                area = squareSide * squareSide;
                break;
            case "rectangle":
                double rectangleSideA = Double.parseDouble(scanner.nextLine());
                double rectangleSideB = Double.parseDouble(scanner.nextLine());
                area = rectangleSideA * rectangleSideB;
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                area = radius * radius * Math.PI;
                break;
            case "triangle":
                double triangleSide = Double.parseDouble(scanner.nextLine());
                double triangleHight = Double.parseDouble(scanner.nextLine());
                area = (triangleSide * triangleHight) / 2;
        }
        System.out.printf("%.3f", area);
    }
}
