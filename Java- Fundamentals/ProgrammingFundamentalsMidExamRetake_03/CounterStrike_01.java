package ProgrammingFundamentalsMidExamRetake_03;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int energy = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int wonBattleCounter = 0;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (energy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattleCounter, energy);
                return;
            }
            energy -= distance;
            wonBattleCounter++;
            if (wonBattleCounter % 3 == 0) {
                energy += wonBattleCounter;
            }
            input = sc.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonBattleCounter, energy);
    }
}
