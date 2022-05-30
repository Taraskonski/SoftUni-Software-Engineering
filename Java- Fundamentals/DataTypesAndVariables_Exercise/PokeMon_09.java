package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PokeMon_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int temp = n;
        int poked = 0;

        while (m <= temp) {
            temp -= m;
            poked++;
            if (temp == n * 0.5 && y != 0) {
                temp /= y;
            }
        }
        System.out.printf("%d%n", temp);
        System.out.printf("%d", poked);
    }
}
