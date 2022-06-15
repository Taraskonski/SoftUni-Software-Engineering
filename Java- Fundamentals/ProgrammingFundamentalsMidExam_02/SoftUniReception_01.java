package ProgrammingFundamentalsMidExam_02;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstEmployeeEfficiency = Integer.parseInt(sc.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(sc.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(sc.nextLine());
        int studentsCount = Integer.parseInt(sc.nextLine());

        int answeredPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int hourCount = 0;
        while (studentsCount > 0) {
            studentsCount -= answeredPerHour;
            hourCount++;
            if (hourCount % 4 == 0) {
                hourCount ++;
            }
        }
        System.out.printf("Time needed: %dh.", hourCount);
    }
}
