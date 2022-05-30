import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(city)) {
            if ("coffee".equals(product)) {
                double result = (0.50 * quantity);
                System.out.println(result);
            } else if ("water".equals(product)) {
                double result = (0.80 * quantity);
                System.out.println(result);
            } else if ("beer".equals(product)) {
                double result = (1.20 * quantity);
                System.out.println(result);
            } else if ("sweets".equals(product)) {
                double result = (1.45 * quantity);
                System.out.println(result);
            } else if ("peanuts".equals(product)) {
                double result = (1.60 * quantity);
                System.out.println(result);
            }else {
                System.out.println("Error");
            }
        if ("Plovdiv".equals(city)) {
                if ("coffee".equals(product)) {
                    double result = (0.40 * quantity);
                    System.out.println(result);
            } else if ("water".equals(product)) {
                    double result = (0.70 * quantity);
                    System.out.println(result);
                } else if ("beer".equals(product)) {
                    double result = (1.15 * quantity);
                    System.out.println(result);
                } else if ("sweets".equals(product)) {
                    double result = (1.30 * quantity);
                    System.out.println(result);
                } else if ("peanuts".equals(product)) {
                    double result = (1.50 * quantity);
                    System.out.println(result);
                }
        if ("Varna".equals(city)) {
                if ("coffee".equals(product)) {
                        double result = (0.45 * quantity);
                        System.out.println(result);
                    } else if ("water".equals(product)) {
                        double result = (0.70 * quantity);
                        System.out.println(result);
                    } else if ("beer".equals(product)) {
                        double result = (1.10 * quantity);
                        System.out.println(result);
                    } else if ("sweets".equals(product)) {
                        double result = (1.35 * quantity);
                        System.out.println(result);
                    } else if ("peanuts".equals(product)) {
                        double result = (1.55 * quantity);
                        System.out.println(result);
                    }
                }
            }
        }
    }
}

