package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] doubleZero = new int[inputArr.length + 2];

        for (int i = 1, j = 0; i <= inputArr.length; i++, j++) {
            doubleZero[i] = inputArr[j];
        }
        doubleZero[doubleZero.length - 1] = 0;
        doubleZero[0] = 0;

        int leftSum = 0;
        int rightSum = 0;
        int index = -1;

        for (int i = 0; i < doubleZero.length - 2; i++) {
            leftSum += doubleZero[i];
            rightSum = 0;
            for (int j = doubleZero.length - 1; (j > 0 && (i + 1) < j); j--) {
                rightSum += doubleZero[j];

                if (leftSum == rightSum && j - i == 2) {
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else if (index == -1) {
            System.out.println("no");
        }
    }
}
