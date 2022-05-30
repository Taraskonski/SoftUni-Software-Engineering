package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class BeerKegs_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String bigKegModel = "";
        double volumeBiggest = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {

            String kegModel = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            double volume = Math.PI * (radius * radius) * height;
            if (volume > volumeBiggest) {
                volumeBiggest = volume;
                bigKegModel = kegModel;
            }
        }
        System.out.println(bigKegModel);
    }
}
