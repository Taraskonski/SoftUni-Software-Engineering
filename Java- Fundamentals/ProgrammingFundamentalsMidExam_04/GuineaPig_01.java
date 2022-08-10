package ProgrammingFundamentalsMidExam_04;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double food = (Double.parseDouble(sc.nextLine())) * 1000;
        double hay = (Double.parseDouble(sc.nextLine())) * 1000;
        double cover = (Double.parseDouble(sc.nextLine())) * 1000;
        double weight = (Double.parseDouble(sc.nextLine())) * 1000;

        int days = 1;

        for (int i = 1; i <= 30; i++) {
            food -= 300;
            if (days % 2 == 0) {
                hay -= food * 0.05;
            }
            if (days % 3 == 0) {
                cover -= weight / 3;
            }
            days++;
        }

        if (food <= 0 || hay <= 0 || cover <= 0) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    (food / 1000), (hay / 1000), (cover / 1000));
        }
    }
}
