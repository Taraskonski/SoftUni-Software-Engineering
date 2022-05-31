import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int rating = 0;
        double sales = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(sc.nextLine());

            rating = x % 10;
            if (rating == 2) {
                sales += 0;
                r2 += rating;
            }
            if (rating == 3) {
                sales += (x / 10) * 0.5;
                r3 += rating;
            }
            if (rating == 4) {
                sales += (x / 10) * 0.7;
                r4 += rating;
            }
            if (rating == 5) {
                sales += (x / 10) * 0.85;
                r5 += rating;
            }
            if (rating == 6) {
                sales += (x / 10);
                r6 += rating;
            }
        }
        double arithmeticRating = (r2 * 1.0 + r3 + r4 + r5 + r6) / n;
        System.out.printf("%.2f%n", sales);
        System.out.printf("%.2f", arithmeticRating);
    }
}