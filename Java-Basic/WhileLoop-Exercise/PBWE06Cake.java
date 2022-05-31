import java.util.Scanner;

public class PBWE06Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        int cake = width * length;

        int piecesCounter = 0;
        boolean flag = false;
        String command = sc.nextLine();
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            piecesCounter = piecesCounter + pieces;
            if (piecesCounter >= cake) {
                flag = true;
                break;
            }
            command = sc.nextLine();
        } if (flag) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesCounter - cake));
        } else {
            System.out.printf("%d pieces are left.", Math.abs(piecesCounter - cake));
        }
    }
}