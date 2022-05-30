import java.util.Scanner;

public class PB07HousePainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        //walls
        double areaSidewall = x * y;
        double areaWindow = 1.5 * 1.5;
        double sumTwoSidewalls = (areaSidewall * 2) - (areaWindow * 2);
        double areaBackWall = x * x;
        double entrance = 2 * 1.2;
        double sumTwoSmallWalls = (areaBackWall * 2) - entrance;
        double totalWallsArea = sumTwoSmallWalls + sumTwoSidewalls;
        double totalGreenPaint = totalWallsArea / 3.4;
        //roof
        double bigSidesArea = 2 * areaSidewall;
        double trianglesArea = (2 * ((x * h) / 2));
        double totalRoofArea = bigSidesArea + trianglesArea;
        double redPaint = totalRoofArea / 4.3;

        System.out.printf("%.2f %n", totalGreenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
