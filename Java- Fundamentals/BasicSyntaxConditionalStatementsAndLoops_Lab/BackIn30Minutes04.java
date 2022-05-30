package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        m = m + 30;
        if (m > 59) {
            h = h + 1;
            m = m - 60;
        }
        if (h > 23) {
            h = 0;
        }
        System.out.printf("%d:%02d", h, m);
    }
}
