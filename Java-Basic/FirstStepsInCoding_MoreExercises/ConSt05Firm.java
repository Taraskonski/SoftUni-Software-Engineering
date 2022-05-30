import java.util.Scanner;

public class ConSt05Firm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hours = Double.parseDouble(sc.nextLine());
        double days = Double.parseDouble(sc.nextLine());
        double workers = Double.parseDouble(sc.nextLine());

        double training = days * 0.90;
        double realHours = training * 8;
        double offTime = workers * (2 * days);
        double allHours = realHours + offTime;
        double difference = 0;

        if (allHours >= hours) {
            difference = allHours - hours;
            System.out.printf("Yes!%.0f hours left.", Math.floor(difference));
        } else {
            difference = hours - allHours;
            System.out.printf("Not enough time!%.0f hours needed.", Math.ceil(difference));
        }
    }
}
