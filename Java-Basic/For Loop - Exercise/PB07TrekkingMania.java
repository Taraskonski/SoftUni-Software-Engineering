import java.util.Scanner;

public class PB07TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = Integer.parseInt(sc.nextLine());

        int allClimbers = 0;
        int musalaClimbersGr = 0;
        int montblanClimbersGr = 0;
        int kilimanjaroClimbersGr = 0;
        int k2ClimbersGr = 0;
        int everestClimbersGr = 0;
        for (int i = 1; i <= groups ; i++) {
            int climbersGroupCnt = Integer.parseInt(sc.nextLine());
            allClimbers = allClimbers + climbersGroupCnt;

            if (climbersGroupCnt <= 5) {
                musalaClimbersGr = musalaClimbersGr + climbersGroupCnt;
            }
            else if (climbersGroupCnt <= 12) {
                montblanClimbersGr = montblanClimbersGr + climbersGroupCnt;
            }
            else if (climbersGroupCnt <= 25) {
                kilimanjaroClimbersGr = kilimanjaroClimbersGr + climbersGroupCnt;
            }
            else if (climbersGroupCnt <= 40) {
                k2ClimbersGr = k2ClimbersGr + climbersGroupCnt;
            }
            else {
                everestClimbersGr = everestClimbersGr + climbersGroupCnt;
            }
        }
        System.out.printf("%.2f%%%n", musalaClimbersGr * 1.0 / allClimbers * 100);
        System.out.printf("%.2f%%%n", montblanClimbersGr * 1.0 / allClimbers * 100);
        System.out.printf("%.2f%%%n", kilimanjaroClimbersGr * 1.0 / allClimbers * 100);
        System.out.printf("%.2f%%%n", k2ClimbersGr * 1.0 / allClimbers * 100);
        System.out.printf("%.2f%%%n", everestClimbersGr * 1.0 / allClimbers * 100);
    }
}
