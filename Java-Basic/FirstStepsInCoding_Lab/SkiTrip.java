import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0;

        if (place.equals("room for one person")) {
            if (days != 0) {
                if (rating.equals("positive")) {
                    price = ((days - 1) * 18);
                    System.out.printf("%.2f", (price + (price * 0.25)));
                } else if (rating.equals("negative")) {
                    price = ((days - 1) * 18);
                    System.out.printf("%.2f", (price - (price * 0.10)));
                }
            }
        } else if (place.equals("apartment")) {
            if (days < 10) {
                if (rating.equals("positive")) {
                    price = ((days - 1) * 25) - (((days - 1) * 25) * 0.30);
                    System.out.printf("%.2f", (price + (price * 0.25)));
                } else if (rating.equals("negative")) {
                    price = ((days - 1) * 25) - (((days - 1) * 25) * 0.30);
                    System.out.printf("%.2f", (price - (price * 0.10)));
                }
            } else if (days >= 10 && days <= 15) {
                if (rating.equals("positive")) {
                    price = ((days - 1) * 25) - (((days - 1) * 25) * 0.35);
                    System.out.printf("%.2f", (price + (price * 0.25)));
                } else if (rating.equals("negative")) {
                    price = ((days - 1) * 25) - (((days - 1) * 25) * 0.35);
                    System.out.printf("%.2f", (price - (price * 0.10)));
                }
            } else if (days > 15) {
                if (rating.equals("positive")) {
                    price = ((days - 1) * 25) - (((days - 1) * 25) * 0.50);
                    System.out.printf("%.2f", (price + (price * 0.25)));
                } else if (rating.equals("negative")) {
                    price = ((days - 1) * 25) - (((days - 1) * 25) * 0.50);
                    System.out.printf("%.2f", (price - (price * 0.10)));
                }
            }
        } else if (place.equals("president apartment")) {
            if (days < 10) {
                if (rating.equals("positive")) {
                    price = ((days - 1) * 35) - (((days - 1) * 35) * 0.10);
                    System.out.printf("%.2f", (price + (price * 0.25)));
                } else if (rating.equals("negative")) {
                    price = ((days - 1) * 35) - (((days - 1) * 35) * 0.10);
                    System.out.printf("%.2f", (price - (price * 0.10)));
                }
            } else if (days >= 10 && days <= 15) {
                if (rating.equals("positive")) {
                    price = ((days - 1) * 35) - (((days - 1) * 35) * 0.15);
                    System.out.printf("%.2f", (price + (price * 0.25)));
                } else if (rating.equals("negative")) {
                    price = ((days - 1) * 35) - (((days - 1) * 35) * 0.10);
                    System.out.printf("%.2f", (price - (price * 0.10)));
                }
            } else if (days > 15) {
                if (rating.equals("positive")) {
                    price = ((days - 1) * 35) - (((days - 1) * 35) * 0.20);
                    System.out.printf("%.2f", (price + (price * 0.25)));
                } else if (rating.equals("negative")) {
                    price = ((days - 1) * 35) - (((days - 1) * 35) * 0.20);
                    System.out.printf("%.2f", (price - (price * 0.10)));
                }
            }
        }
    }
}




