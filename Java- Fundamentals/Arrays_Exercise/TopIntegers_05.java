package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < inputArr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] <= inputArr[j]) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(inputArr[i] + " ");
            }
        }
    }
}
