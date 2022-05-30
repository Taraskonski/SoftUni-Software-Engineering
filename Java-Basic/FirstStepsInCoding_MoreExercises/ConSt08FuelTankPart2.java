import java.util.Scanner;

public class ConSt08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fuel = sc.nextLine();
        double litter = Double.parseDouble(sc.nextLine());
        String clubCard = sc.nextLine();

        boolean fuelType = fuel.equals("Gas") ||
                fuel.equals("Gasoline") ||
                fuel.equals("Diesel");
        boolean cardAv = clubCard.equals("Yes") ||
                clubCard.equals("No");
        boolean litterQt = litter >= 20 && litter <= 25 ||
                litter < 20 || litter > 25;
        double litterDiscount = 0;

        if (fuelType && litterQt && cardAv) {
            if (fuel.equals("Gas")) {
                if (clubCard.equals("Yes")) {
                    if (litter >= 20 && litter <= 25) {
                        litterDiscount = ((0.93 - 0.08) * litter) * 0.92;
                    }
                    if (litter < 20) {
                        litterDiscount = (0.93 - 0.08) * litter;
                    }
                    if (litter > 25) {
                        litterDiscount = ((0.93 - 0.08) * litter) * 0.90;
                    }
                }
                if (clubCard.equals("No")) {
                    if (litter >= 20 && litter <= 25) {
                        litterDiscount = ((0.93 * litter) * 0.92);
                    }
                    if (litter < 20) {
                        litterDiscount = 0.93 * litter;
                    }
                    if (litter > 25) {
                        litterDiscount = ((0.93 * litter) * 0.90);
                    }
                }
            } else if (fuel.equals("Gasoline")) {
                if (clubCard.equals("Yes")) {
                    if (litter >= 20 && litter <= 25) {
                        litterDiscount = ((2.22 - 0.18) * litter) * 0.92;
                    }
                    if (litter < 20) {
                        litterDiscount = (2.22 - 0.18) * litter;
                    }
                    if (litter > 25) {
                        litterDiscount = ((2.22 - 0.18) * litter) * 0.90;
                    }
                }
                if (clubCard.equals("No")) {
                    if (litter >= 20 && litter <= 25) {
                        litterDiscount = ((2.22 * litter) * 0.92);
                    }
                    if (litter < 20) {
                        litterDiscount = 2.22 * litter;
                    }
                    if (litter > 25) {
                        litterDiscount = (2.22 * litter) * 0.90;
                    }
                }
            }
        }
        if (fuel.equals("Diesel")) {
            if (clubCard.equals("Yes")) {
                if (litter >= 20 && litter <= 25) {
                    litterDiscount = ((2.33 - 0.12) * litter) * 0.92;
                }
                if (litter < 20) {
                    litterDiscount = (2.33 - 0.12) * litter;
                }
                if (litter > 25) {
                    litterDiscount = ((2.33 - 0.12) * litter) * 0.90;
                }
            }
            if (clubCard.equals("No")) {
                if (litter >= 20 && litter <= 25) {
                    litterDiscount = ((2.33 * litter) * 0.92);
                }
                if (litter < 20) {
                    litterDiscount = 2.33 * litter;
                }
                if (litter > 25) {
                    litterDiscount = (2.33 * litter) * 0.90;
                }
            }
        }
        System.out.printf("%.2f lv.", litterDiscount);
    }
}