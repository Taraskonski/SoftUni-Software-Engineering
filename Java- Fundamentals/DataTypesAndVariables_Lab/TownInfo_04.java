package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String town = sc.nextLine();
        int population = Integer.parseInt(sc.nextLine());
        double area = Double.parseDouble(sc.nextLine());
        int convertedArea = (int) area;

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, convertedArea);
    }
}