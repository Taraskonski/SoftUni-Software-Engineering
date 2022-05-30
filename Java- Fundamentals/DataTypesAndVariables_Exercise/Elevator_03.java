package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());
        int elevate = (int) Math.ceil((double) n / p);

        System.out.println(elevate);
    }
}