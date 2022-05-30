import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float area = Float.parseFloat(scanner.nextLine());
        float price = 7.61f;
        float discount = 0.18f;
        float total = area * price;
        float discountSum = discount * total;
        float finalPrice = total - discountSum;
            System.out.println("The final price is: " + finalPrice + " lv.");
            System.out.println("The discount is: " + discountSum + " lv.");

    }
}
