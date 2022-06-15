package Methods_Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(getCountOfTheVowels(input));

    }

    private static int getCountOfTheVowels(String input) {
        String[] arr = input.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a") || arr[i].equals("A")) {
                count++;
            } else if (arr[i].equals("e") || arr[i].equals("E")) {
                count++;
            } else if (arr[i].equals("i") || arr[i].equals("I")) {
                count++;
            } else if (arr[i].equals("o") || arr[i].equals("O")) {
                count++;
            } else if (arr[i].equals("u") || arr[i].equals("U")) {
                count++;
            } else if (arr[i].equals("y") || arr[i].equals("Y")) {
                count++;
            }
        }
        return count;
    }
}
