package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = Arrays.stream(sc.nextLine()
                        .split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String typeOfCommand = command[0];
            switch (typeOfCommand) {
                case "swap":
                    int firstIndex = Integer.parseInt(command[1]);
                    int firstElement = numArr[firstIndex];
                    int secondIndex = Integer.parseInt(command[2]);
                    int secondElement = numArr[secondIndex];
                    numArr[firstIndex] = secondElement;
                    numArr[secondIndex] = firstElement;
                    break;
                case "multiply":
                    int firstIndexElement = Integer.parseInt(command[1]);
                    int firstElementMultiply = numArr[firstIndexElement];
                    int secondIndexElement = Integer.parseInt(command[2]);
                    int secondElementMultiply = numArr[secondIndexElement];
                    int product = firstElementMultiply * secondElementMultiply;
                    numArr[firstIndexElement] = product;
                    break;
                case "decrease":
                    for (int i = 0; i <= numArr.length - 1; i++) {
                        numArr[i] = numArr[i] - 1;
                    }
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println(Arrays.toString(numArr).replace("[", "").replace("]", ""));
    }

}
