package ProgrammingFundamentalsFinalExamRetake_01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("(?<symbols>[#\\|])(?<product>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)");
        Matcher matcher = pattern.matcher(input);
        List<String> items = new ArrayList<>();

        int totalCalories = 0;
        while (matcher.find()) {
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
            String product = matcher.group("product");
            String date = matcher.group("date");
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", product,date,calories));
        }
        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        for (String item : items) {
            System.out.print(item);
        }
    }
}
