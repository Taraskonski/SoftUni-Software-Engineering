import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if ((x != 0) && !((x <= 200) && (x >= 100))) {
            System.out.println("invalid");
        }
    }
}
