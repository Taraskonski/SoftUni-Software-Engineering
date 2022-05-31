import java.util.Scanner;

public class PBWE02ExamPreparation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lowGrade = Integer.parseInt(sc.nextLine());

        double sumGrade = 0;
        int tasksCounter = 0;
        int lowGradeCounter = 0;
        String lastTask = "";
        String input = sc.nextLine();
        while (!input.equals("Enough")) {
            String currentTask = input;
            int currentGrade = Integer.parseInt(sc.nextLine());

            if (currentGrade <= 4) {
                lowGradeCounter++;
            }
            if (lowGradeCounter >= lowGrade) {
                break;
            }
            tasksCounter++;
            sumGrade = sumGrade + currentGrade;
            lastTask = currentTask;

            input = sc.nextLine();
        }
        if (lowGradeCounter >= lowGrade) {
            System.out.printf("You need a break, %d poor grades.", lowGradeCounter);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrade / tasksCounter);
            System.out.printf("Number of problems: %d%n", tasksCounter);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
