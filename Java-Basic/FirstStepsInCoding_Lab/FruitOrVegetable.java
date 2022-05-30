import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String products = scanner.nextLine();

        if (products.equals("banana") || products.equals("apple") || products.equals("kiwi") || products.equals("cherry") || products.equals("lemon") || products.equals("grapes")) {
            System.out.println("fruit");
        }else if (products.equals("tomato") || products.equals("cucumber") || products.equals("pepper") || products.equals("carrot")) {
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }
}
