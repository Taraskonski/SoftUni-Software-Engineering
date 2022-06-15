package ProgrammingFundamentalsMidExamRetake_01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int[] wagonArr = Arrays.stream(sc.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < wagonArr.length; i++) {
            if ((wagonArr[i] < 4)) {
                if (people >= 4 - wagonArr[i]) {
                    people -= 4 - wagonArr[i];
                    wagonArr[i] = 4;
                } else {
                    wagonArr[i] += people;
                    people = 0;
                }
            }
        }
        boolean full = IntStream.range(0, wagonArr.length).noneMatch(i -> wagonArr[i] != 4);
        if (people == 0 && !full) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0 && full) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        System.out.print(Arrays.toString(wagonArr).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
