import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = Double.parseDouble(sc.nextLine());
        double totalPrice = area * 7.61;
        double discount = totalPrice * 0.18;
        double finalPrice = totalPrice - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
