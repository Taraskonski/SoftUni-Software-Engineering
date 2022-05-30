import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int nylonSqM = Integer.parseInt(scanner.nextLine());
            int paintLt = Integer.parseInt(scanner.nextLine());
            int diluentLt = Integer.parseInt(scanner.nextLine());
            int workHours = Integer.parseInt(scanner.nextLine());
                float reservePaint = 0.10f;
                float wagePerHour = 0.30f;
                float bags = 0.40f;
                    float nylonPrice = 1.50f;
                    float paintPrice = 14.50f;
                    float diluentPrice = 5.00f;
                        float nylonSum = (nylonSqM + 2) * nylonPrice;
                        float paintSum = (paintLt + (paintLt * reservePaint)) * paintPrice;
                        float diluentSum = diluentLt * diluentPrice;
                        float totalSumIngredients = nylonSum + paintSum + diluentSum +bags;
                        float sumWorkers = (totalSumIngredients * wagePerHour) * workHours;
                            System.out.println(totalSumIngredients + sumWorkers);

    }
}
