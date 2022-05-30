import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int pagesNum = Integer.parseInt(scanner.nextLine());
            int pagesPerHour = Integer.parseInt(scanner.nextLine());
            int totalHours = pagesNum / pagesPerHour;
            int days = Integer.parseInt(scanner.nextLine());
                System.out.println(totalHours / days);
    }
}
