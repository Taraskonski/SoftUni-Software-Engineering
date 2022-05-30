import java.util.Scanner;

public class ConSt01PipesInPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volume = Double.parseDouble(sc.nextLine());
        double pipeOne = Double.parseDouble(sc.nextLine());
        double pipeTwo = Double.parseDouble(sc.nextLine());
        double hours = Double.parseDouble(sc.nextLine());
        double pipeOneWork = pipeOne * hours;
        double pipeTwoWork = pipeTwo * hours;
        double poolField = pipeOneWork + pipeTwoWork;
        double poolFieldPercent = (poolField / volume) * 100;
        double pipeWorkOnePercent = (pipeOneWork / poolField) * 100;
        double pipeWorkTwoPercent = (pipeTwoWork / poolField) * 100;


        if (volume >= poolField) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolFieldPercent, pipeWorkOnePercent, pipeWorkTwoPercent);
        } else if (poolField > volume) {
            double overflows = poolField - volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overflows);
        }
    }
}
