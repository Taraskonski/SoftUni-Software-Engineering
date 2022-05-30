import java.util.Scanner;

public class PBForLab05CharacterSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int a = 0; a < text.length(); a++) {
            char letter = text.charAt(a);
            System.out.println(letter);
        }
    }
}
