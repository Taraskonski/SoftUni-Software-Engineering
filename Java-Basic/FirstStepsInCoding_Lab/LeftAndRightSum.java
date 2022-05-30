import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int RightSum = 0;
        int LeftSum = 0;

        for (int i = 1; i <= n; i++) {
            RightSum = RightSum + scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            LeftSum = LeftSum + scanner.nextInt();
        }
        if (LeftSum == RightSum) {
            System.out.println("Yes, sum = " + RightSum);
        } else {
            int diff = Math.abs(LeftSum - RightSum);
            System.out.println("No, diff = " + diff);
        }
    }
}

