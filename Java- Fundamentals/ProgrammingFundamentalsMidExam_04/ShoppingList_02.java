package ProgrammingFundamentalsMidExam_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(sc.nextLine()
                        .split("!"))
                .collect(Collectors.toList());
        String input = sc.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] actions = input.split(" ");
            String action = actions[0];
            String product = actions[1];

            switch (action) {
                case "Urgent":

                    if (!shoppingList.contains(product)) {
                        shoppingList.add(0, product);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(product)) {
                        shoppingList.remove(shoppingList.indexOf(product));
                    }
                    break;
                case "Correct":
                    String newProductName = actions[2];
                    if (shoppingList.contains(product)) {
                        int indexOfOldItem = shoppingList.indexOf(product);
                        shoppingList.set(indexOfOldItem, newProductName);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(product)) {
                        shoppingList.remove(shoppingList.indexOf(product));
                        shoppingList.add(product);
                    }
                    break;
            }

            input = sc.nextLine();
        }
        System.out.println(shoppingList.toString().replace("[", "").replace("]", "").replace("\\s+", ", "));
    }
}
