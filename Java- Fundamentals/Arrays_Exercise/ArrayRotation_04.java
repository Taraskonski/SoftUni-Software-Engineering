package Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int rotations = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < rotations; i++) {
            String element1 = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = element1;
        }
        String output = String.join(" ", input);
        System.out.println(output);
    }
}
