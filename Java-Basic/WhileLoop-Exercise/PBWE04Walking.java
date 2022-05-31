import java.util.Scanner;

public class PBWE04Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stepsGoal = 10000;

        int stepsCounter = 0;
        String input = sc.nextLine();
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);

            stepsCounter = stepsCounter + steps;

            if (stepsCounter >= stepsGoal) {
                break;
            }

            input = sc.nextLine();

        }
            if (input.equals("Going home")) {
                int homeSteps = Integer.parseInt(sc.nextLine());
                stepsCounter = stepsCounter + homeSteps;

        }
        int diff = Math.abs(stepsCounter - stepsGoal);
        if (stepsCounter >= stepsGoal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}