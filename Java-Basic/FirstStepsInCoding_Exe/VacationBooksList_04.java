import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int page = Integer.parseInt(sc.nextLine());
        int pagePerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int readingDays = page / pagePerHour;
        int hoursNeeded = readingDays / days;

        System.out.println(hoursNeeded);
    }
}
