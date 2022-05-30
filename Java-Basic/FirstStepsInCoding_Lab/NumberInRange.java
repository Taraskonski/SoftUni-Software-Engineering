import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        if (x >= -100 && x <= 100 && x !=0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
