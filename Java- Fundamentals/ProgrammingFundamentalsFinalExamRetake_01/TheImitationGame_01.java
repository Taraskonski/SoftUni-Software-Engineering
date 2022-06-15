package ProgrammingFundamentalsFinalExamRetake_01;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        //String[] encryptedMessage = message.split("");
        String input = sc.nextLine();

        while (!input.equals("Decode")) {
            String[] instruction = input.split("\\|");
            String action = instruction[0];

            switch (action) {
                case "Move":
                    int numOfLetters = Integer.parseInt(instruction[1]);
                    String firstPart = message.substring(0, numOfLetters);
                    String secondPart = message.substring(numOfLetters);
                    message = secondPart + firstPart;
                    break;
                case "Insert":
                    int index = Integer.parseInt(instruction[1]);
                    String letter = instruction[2];
                    String partOne = message.substring(0, index);
                    String partTwo = message.substring(index);
                    message = partOne.concat(letter).concat(partTwo);
                    break;
                case "ChangeAll":
                    String substring = instruction[1];
                    String replacement = instruction[2];
                    message = message.replace(substring, replacement);
                    break;
            }

            input = sc.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }
}
