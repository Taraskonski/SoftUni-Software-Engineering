package ProgrammingFundamentalsFinalExam_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile("(=|\\/)(?<location>[A-Z][A-Za-z]{2,})\\1");  //(=|\/) - символите с които трябва да започва и завършва търсената дума  \\1 - указва на регекса да вземе данните от група 1 (=|\/)
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();

        int totalSum = 0;
        while (matcher.find()) {
            String destination = matcher.group("location");
            totalSum += destination.length();
            destinations.add(destination);
        }
        String delimiter = ", ";
        System.out.println("Destinations: " + String.join(delimiter, destinations));
        System.out.printf("Travel Points: %d", totalSum);
    }
}
