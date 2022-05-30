import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        double stays = Double.parseDouble(scanner.nextLine());

        if (month.equals("May") || month.equals("October")) {
            if (stays <= 7) {
                System.out.printf("Apartment: %.2f lv.", (stays * 65));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", (stays * 50));
            } else if (stays > 7 && stays <= 14) {
                System.out.printf("Apartment: %.2f lv.", (stays * 65));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", ((stays * 50) - (stays * 50 * 0.05)));
            } else if (stays > 14) {
                System.out.printf("Apartment: %.2f lv.", ((stays * 65) - (stays * 65 * 0.10)));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", ((stays * 50) - (stays * 50 * 0.30)));
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (stays <= 7) {
                System.out.printf("Apartment: %.2f lv.", (stays * 68.70));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", (stays * 75.20));
            } else if (stays >7 && stays <= 14) {
                System.out.printf("Apartment: %.2f lv.", (stays * 68.70));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", (stays * 75.20));
            } else if (stays > 14) {
                System.out.printf("Apartment: %.2f lv.", (stays * 68.70) - (stays * 68.70 * 0.10));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", (stays * 75.20) - (stays * 75.20 * 0.20));
            }
        } else if (month.equals("July") || month.equals("August")) {
            if (stays <= 14) {
                System.out.printf("Apartment: %.2f lv.", (stays * 77));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", (stays * 76));
            } else if (stays > 14) {
                System.out.printf("Apartment: %.2f lv.", (stays * 77) - (stays * 77 * 0.10));
                System.out.println("");
                System.out.printf("Studio: %.2f lv.", (stays * 76));
            }
        }
    }
}