import java.util.Scanner;

public class ConSt06Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double days = Double.parseDouble(sc.nextLine());
        double food = Double.parseDouble(sc.nextLine());  //kg
        double dogFood = Double.parseDouble(sc.nextLine()); //kg
        double catFood = Double.parseDouble(sc.nextLine()); //kg
        double turtleFood = Double.parseDouble(sc.nextLine()); //gr

        double dogFoodPerDay = days * dogFood;
        double catFoodPerDay = days * catFood;
        double turtleFoodPerDay = days * (turtleFood / 1000);
        double totalFoodNeeded = dogFoodPerDay + catFoodPerDay + turtleFoodPerDay;
        double foodLeft = 0;
        double foodNeeded = 0;

        if (food >= totalFoodNeeded) {
            foodLeft = food - totalFoodNeeded;
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft));
        } else {
            foodNeeded = totalFoodNeeded - food;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded));
        }
    }
}
