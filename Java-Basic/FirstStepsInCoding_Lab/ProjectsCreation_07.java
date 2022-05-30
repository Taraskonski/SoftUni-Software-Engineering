import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int numPr = Integer.parseInt(sc.nextLine());
        int totalHr = numPr * 3;

        System.out.println("The architect " + name + " will need " + totalHr + " hours to complete " + numPr + " project/s.");
    }
}
