import java.util.Scanner;

public class PB03Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sc.nextLine());

            if (number < 200) {
                countP1++;
            } else if (number <= 399) {
                countP2++;
            } else if (number <= 599) {
                countP3++;
            } else if (number <= 799) {
                countP4++;
            } else {
                countP5++;
            }
        }
        p1 = countP1 * 100.0 / n;
        p2 = countP2 * 100.0 / n;
        p3 = countP3 * 100.0 / n;
        p4 = countP4 * 100.0 / n;
        p5 = countP5 * 100.0 / n;

        System.out.printf("%.2f%%", p1);
        System.out.println();
        System.out.printf("%.2f%%", p2);
        System.out.println();
        System.out.printf("%.2f%%", p3);
        System.out.println();
        System.out.printf("%.2f%%", p4);
        System.out.println();
        System.out.printf("%.2f%%", p5);
    }
}
