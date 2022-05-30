import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghtCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int heightCm = Integer.parseInt(scanner.nextLine());
        float percents = Float.parseFloat(scanner.nextLine());
        double aquariumVolume = lenghtCm * widthCm * heightCm;
        double waterVolume = aquariumVolume * 0.001;
        float occupiedVolume = percents / 100;
        double totalWater = waterVolume * (1 - occupiedVolume);
        System.out.println(totalWater);
    }
}
