package MethodsMoreExercise;

import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());
        getCenterPint(x1, y1, x2, y2);

    }

    private static void getCenterPint(int x1, int y1, int x2, int y2) {
        int point1 = Math.abs(x1) + Math.abs(y1);
        int point2 = Math.abs(x2) + Math.abs(y2);
        if (point1 < point2) {
            System.out.println("(" + x1 + "," + " " + y1 + ")");
        } else if (point1 > point2) {
            System.out.println("(" + x2 + "," + " " + y2 + ")");
        } else {
            System.out.println("(" + x1 + "," + " " + y1 + ")");
        }
    }
}
