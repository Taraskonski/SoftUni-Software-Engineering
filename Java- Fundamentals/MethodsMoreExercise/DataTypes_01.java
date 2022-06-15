package MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        switch (input) {
            case "int":
                int intNumber = Integer.parseInt(sc.nextLine());
                System.out.println(getDataType(intNumber));
                break;
            case "real":
                double doubleNumber = Double.parseDouble(sc.nextLine());
                System.out.println(getDataType(doubleNumber));
                break;
            case "string":
                String str = sc.nextLine();
                System.out.println(getDataType(str));
                break;
        }

    }

    private static String getDataType(int intNumber) {
        return String.format("%d", intNumber * 2);
    }

    private static String getDataType(double doubleNumber) {
        return String.format("%.2f", doubleNumber * 1.5);
    }

    private static String getDataType(String str) {
        return String.format("$" + str + "$");
    }
}
