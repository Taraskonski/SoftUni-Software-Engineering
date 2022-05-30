import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        int pos = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                pos += 1;
            } if (x.charAt(i) == 'e') {
                pos += 2;
            } if (x.charAt(i) == 'i') {
                pos += 3;
            } if (x.charAt(i) == 'o') {
                pos += 4;
            }if (x.charAt(i) == 'u') {
                pos += 5;
            }
        }
        System.out.println(pos);
    }
}
