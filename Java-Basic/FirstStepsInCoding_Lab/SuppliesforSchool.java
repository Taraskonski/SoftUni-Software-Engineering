import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pen = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int chemicals = Integer.parseInt(scanner.nextLine());
            float penPrice = 5.80f;
            float markersPrice = 7.20f;
            float chemicalsPrice = 1.20f;
                float discount = Float.parseFloat(scanner.nextLine());
                float discountPercent = discount / 100;
                float totalSumPen = penPrice * pen;
                float totalSumMarkers = markersPrice * markers;
                float totalChem = chemicalsPrice * chemicals;
                float totalSum = totalSumPen + totalSumMarkers + totalChem;
                    System.out.println(totalSum - (totalSum * discountPercent));

    }
}
