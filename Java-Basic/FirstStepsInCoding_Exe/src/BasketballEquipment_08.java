import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tax = Double.parseDouble(sc.nextLine());

        double sneakers = tax * 0.60;
        double outfit = sneakers * 0.80;
        double ball = outfit / 4;
        double accessories = ball / 5;
        double totalSum = tax + sneakers + outfit + ball + accessories;

        System.out.println(totalSum);
    }
}
