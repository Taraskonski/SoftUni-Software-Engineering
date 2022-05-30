package Arrays_Lab;

import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstRow = sc.nextLine().split("\\s+");
        String[] secondRow = sc.nextLine().split("\\s+");
        int[] arr1 = new int[firstRow.length];
        int[] arr2 = new int[secondRow.length];

        int sum = 0;
        int diff = 0;
        int position = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(firstRow[i]);
            arr2[i] = Integer.parseInt(secondRow[i]);
            if (arr1[i] != arr2[i]) {
                diff++;
                position = i;
                break;
            }
            sum += arr1[i];
        }
        if (diff == 0) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", position);
        }
    }
}
