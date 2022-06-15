package Arrays_Exercise;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] treasureChest = sc.nextLine().split("\\|");
        String input = sc.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        boolean contained = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (command[i].equals(treasureChest[j])) {
                                contained = true;
                                break;
                            }
                        }
                        if (!contained) {
                            String newChest = command[i] + " "
                                    + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(command[1]);
                    if (position <= treasureChest.length - 1 && position >= 0) {
                        String dropItem = treasureChest[position];
                        for (int i = position; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int stealItems = Integer.parseInt(command[1]);
                    if (stealItems >= 0 && stealItems < treasureChest.length) {
                        for (int i = 0; i < stealItems; i++) {
                            System.out.print(treasureChest[treasureChest.length - stealItems + i]);
                            if (i != stealItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[treasureChest.length - stealItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;
                    } else if (stealItems >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;

            }

            input = sc.nextLine();
        }
        String treasureCount = String.join("", treasureChest);
        int charCount = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCount++;
        }
        double averageTreasure = (1.0 * charCount) / treasureChest.length;
        if (charCount > 0) {

            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {

            System.out.println("Failed treasure hunt.");
        }
    }
}
