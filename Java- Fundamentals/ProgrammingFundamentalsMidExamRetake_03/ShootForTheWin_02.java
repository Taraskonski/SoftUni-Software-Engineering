package ProgrammingFundamentalsMidExamRetake_03;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] targets = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = sc.nextLine();
        int shoot = 0;
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index >= targets.length) {

                input = sc.nextLine();
                continue;
            } if (index < 0) {
                input = sc.nextLine();
                continue;
            } if (targets[index] == -1) {
                input = sc.nextLine();
                continue;
            }
            int oldValue = targets[index];
            targets[index] = -1;
            shoot++;
            for (int i = 0; i <= targets.length -1; i++) {
                if (targets[i] == -1) {
                    continue;
                }
                if (oldValue < targets[i]) {
                    int newValue = targets[i] - oldValue;
                    targets[i] = newValue;
                } else if (oldValue >= targets[i] && targets[i] != -1) {
                     int newValue = targets[i] + oldValue;
                    targets[i] = newValue;
                }

                }
            input = sc.nextLine();
        }
        System.out.printf("Shot targets: %d ->", shoot);
        System.out.print(Arrays.toString(targets).replace("[", " ").replace("]", " ")
                .replace(",", ""));
    }
}
