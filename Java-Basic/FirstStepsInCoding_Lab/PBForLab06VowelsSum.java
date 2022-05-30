import java.util.Scanner;

public class PBForLab06VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int value = 0;
        for (int x = 0; x < text.length(); x++) {
            if (text.charAt(x) == 'a') {
                value += 1;
            }
            if (text.charAt(x) == 'e') {
                value += 2;
            }
            if (text.charAt(x) == 'i') {
                value += 3;
            }
            if (text.charAt(x) == 'o') {
                value += 4;
            }
            if (text.charAt(x) == 'u') {
                value += 5;
            }
        }
        System.out.println(value);

    }
}
