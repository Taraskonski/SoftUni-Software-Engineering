import java.util.Scanner;

public class PBWE01OldBooks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String seekBook = sc.nextLine();

        int counter = 0;
        boolean flag = false;
        String input = sc.nextLine();
        while (!input.equals("No More Books")) {
            String book = input;

            if (book.equals(seekBook)) {
                flag = true;
                break;
            }
            counter++;

            input = sc.nextLine();
        }
        if (flag) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
