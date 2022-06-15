package ObjectsAndClasses;

import java.util.Scanner;

public class DecreasingOrder_01 {
    boolean Little(int x, int y) {
        return (x < y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        DecreasingOrder_01 NewObject = new DecreasingOrder_01();

        if (NewObject.Little(a,b)) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        if (NewObject.Little(b,c)) {
            int temp;
            temp = b;
            b = c;
            c = temp;
        }
        if (NewObject.Little(a,b)) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("The numbers arranged in a decreasing order are: " + a + "," + b + "," + c);
    }
}
