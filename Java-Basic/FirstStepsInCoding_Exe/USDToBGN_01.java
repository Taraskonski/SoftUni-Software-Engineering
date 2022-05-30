import java.util.Scanner;

public class USDToBGN_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd = Double.parseDouble(sc.nextLine());

        System.out.println(usd * 1.79549);
    }
}
