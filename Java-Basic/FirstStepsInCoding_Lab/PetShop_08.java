import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogFood = Integer.parseInt(sc.nextLine());
        int catFood = Integer.parseInt(sc.nextLine());
        double total = (catFood * 4) + (dogFood * 2.50);

        System.out.printf("%.2f lv.", total);
    }
}
