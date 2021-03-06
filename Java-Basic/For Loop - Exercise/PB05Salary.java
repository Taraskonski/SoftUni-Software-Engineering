import java.util.Scanner;

public class PB05Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int openedTabs = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());

        for (int i = 1; i <= openedTabs; i++) {
            if (salary > 0) {
                String tabName = sc.nextLine();

                switch (tabName) {
                    case "Facebook":
                        salary -= 150;
                        break;
                    case "Instagram":
                        salary -= 100;
                        break;
                    case "Reddit":
                        salary -= 50;
                        break;
                }
            }
        }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
            }
        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
    }
}