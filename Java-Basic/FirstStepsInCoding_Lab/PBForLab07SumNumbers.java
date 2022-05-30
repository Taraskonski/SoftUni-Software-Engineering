import java.util.Scanner;

public class PBForLab07SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int a = 0; a < x; a++) {
            int number = Integer.parseInt(sc.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
