import java.util.Scanner;

public class ProjectTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine()); // number of projects
        int totalHours = a * 3;
            System.out.println("The architect " + name + " will need " + totalHours + " hours to complete " + a + " project/s.");

    }
}
