import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        double volumeTank = length * width * height;
        double volumeLitters = volumeTank * 0.001;
        double percentConvert = percent / 100;
        double totalLitters = volumeLitters - (volumeLitters * percentConvert);

        System.out.println(totalLitters);
    }
}
