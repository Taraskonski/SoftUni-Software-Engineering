import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("Чудесно!");
        } else {
            if (a % 2 == 0) {
                System.out.println("Добре!");
            } else {
                if (a % 3 == 0) {
                    System.out.println("Още по-добре!");
                } else {
                    if (a % 2 != 0 && a % 3 != 0) {
                        System.out.println("Шегуваш се ...");
                    }
                }
            }
        }
    }
}
