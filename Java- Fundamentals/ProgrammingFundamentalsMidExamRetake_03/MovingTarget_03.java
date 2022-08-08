package ProgrammingFundamentalsMidExamRetake_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("End")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            switch (action) {
                case "Shoot":
                    int indexToShoot = Integer.parseInt(actions.get(1));
                    if (indexToShoot < numberList.size() && indexToShoot >= 0) {
                        numberList.set(indexToShoot, numberList.get(indexToShoot) - Integer.parseInt(actions.get(2)));
                        if (numberList.get(indexToShoot) <= 0) {
                            numberList.remove(indexToShoot);
                        }
                    }
                    break;
                case "Add":
                    int indexToAdd = Integer.parseInt(actions.get(1));
                    int value = Integer.parseInt(actions.get(2));
                    if (indexToAdd >= 0 && indexToAdd < numberList.size()) {
                        numberList.add(indexToAdd, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int indexToStrike = Integer.parseInt(actions.get(1));
                    int radius = Integer.parseInt(actions.get(2));
                    if (indexToStrike + radius < numberList.size() && indexToStrike - radius >= 0) {
                        numberList.subList(indexToStrike - radius, indexToStrike + radius + 1).clear();

                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = sc.nextLine();
        }
        System.out.print(Arrays.toString(new List[]{numberList}).replaceAll("[\\[\\]]", "").replaceAll(", ", "|"));
    }
}
