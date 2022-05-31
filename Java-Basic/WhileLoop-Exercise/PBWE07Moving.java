import java.util.Scanner;

public class PBWE07Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int availableSpace = width * length * height;
        boolean flag = false;
        String input = sc.nextLine();
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            availableSpace = availableSpace - boxes;
            if (availableSpace <= 0) {
                flag = true;
                break;
            }

            input = sc.nextLine();
        }
        if (flag) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
        } else {
            System.out.printf("%d Cubic meters left.", availableSpace);
        }
    }
}
