import java.util.Scanner;

public class PB06Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actorName = sc.nextLine();
        double academyPoints = Double.parseDouble(sc.nextLine());
        int juryCount = Integer.parseInt(sc.nextLine());

        double totalPoints = academyPoints;
        for (int i = 1; i <= juryCount; i++) {
            String juriName = sc.nextLine();
            double juriPoints = Double.parseDouble(sc.nextLine());

            double momentPoints = ((juriName.length() * juriPoints) / 2);

            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + momentPoints;
            }
        }
        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(totalPoints - 1250.5));
        }
    }
}