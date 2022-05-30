package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int finish = Integer.parseInt(sc.nextLine());

        for (int i = start; i <= finish; i++) {
            System.out.print((char) i + " ");
        }
    }
}
