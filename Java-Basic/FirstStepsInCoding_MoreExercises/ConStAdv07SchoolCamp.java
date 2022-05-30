import java.util.Scanner;

public class ConStAdv07SchoolCamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        String group = sc.nextLine();
        double students = Double.parseDouble(sc.nextLine());
        double nights = Double.parseDouble(sc.nextLine());
        double price = 0;

        if (season.equals("Winter") && group.equals("girls") && students < 10) {
            price = (students * 9.60) * nights;
            System.out.printf("Gymnastics %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("boys") && students < 10) {
            price = (students * 9.60) * nights;
            System.out.printf("Judo %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("mixed") && students < 10) {
            price = (students * 10.00) * nights;
            System.out.printf("Ski %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("girls") && students >= 10 && students < 20) {
            price = ((students * 9.60) * nights) * 0.95;
            System.out.printf("Gymnastics %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("boys") && students >= 10 && students < 20) {
            price = ((students * 9.60) * nights) * 0.95;
            System.out.printf("Judo %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("mixed") && students >= 10 && students < 20) {
            price = ((students * 10.00) * nights) * 0.95;
            System.out.printf("Ski %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("girls") && students >= 20 && students < 50) {
            price = ((students * 9.60) * nights) * 0.85;
            System.out.printf("Gymnastics %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("boys") && students >= 20 && students < 50) {
            price = ((students * 9.60) * nights) * 0.85;
            System.out.printf("Judo %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("mixed") && students >= 20 && students < 50) {
            price = ((students * 10.00) * nights) * 0.85;
            System.out.printf("Ski %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("girls") && students >= 50) {
            price = ((students * 9.60) * nights) * 0.50;
            System.out.printf("Gymnastics %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("boys") && students >= 50) {
            price = ((students * 9.60) * nights) * 0.50;
            System.out.printf("Judo %.2f lv.", price);
        } if (season.equals("Winter") && group.equals("mixed") && students >= 50) {
            price = ((students * 10.00) * nights) * 0.50;
            System.out.printf("Ski %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("girls") && students < 10) {
            price = (students * 7.20) * nights;
            System.out.printf("Athletics %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("boys") && students < 10) {
            price = (students * 7.20) * nights;
            System.out.printf("Tennis %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("mixed") && students < 10) {
            price = (students * 9.50) * nights;
            System.out.printf("Cycling %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("girls") && students >= 10 && students < 20) {
            price = ((students * 7.20) * nights) * 0.95;
            System.out.printf("Athletics %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("boys") && students >= 10 && students < 20) {
            price = ((students * 7.20) * nights) * 0.95;
            System.out.printf("Tennis %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("mixed") && students >= 10 && students < 20) {
            price = ((students * 9.50) * nights) * 0.95;
            System.out.printf("Cycling %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("girls") && students >= 20 && students < 50) {
            price = ((students * 7.20) * nights) * 0.85;
            System.out.printf("Athletics %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("boys") && students >= 20 && students < 50) {
            price = ((students * 7.20) * nights) * 0.85;
            System.out.printf("Tennis %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("mixed") && students >= 20 && students < 50) {
            price = ((students * 9.50) * nights) * 0.85;
            System.out.printf("Cycling %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("girls") && students < 10) {
            price = (students * 15.00) * nights;
            System.out.printf("Volleyball %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("boys") && students < 10) {
            price = (students * 15.00) * nights;
            System.out.printf("Football %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("mixed") && students < 10) {
            price = (students * 20.00) * nights;
            System.out.printf("Swimming %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("girls") && students >= 10 && students < 20) {
            price = ((students * 15.00) * nights) * 0.95;
            System.out.printf("Volleyball %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("boys") && students >= 10 && students < 20) {
            price = ((students * 15.00) * nights) * 0.95;
            System.out.printf("Football %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("mixed") && students >= 10 && students < 20) {
            price = ((students * 20.00) * nights) * 0.95;
            System.out.printf("Swimming %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("girls") && students >= 20 && students < 50) {
            price = ((students * 15.00) * nights) * 0.85;
            System.out.printf("Volleyball %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("boys") && students >= 20 && students < 50) {
            price = ((students * 15.00) * nights) * 0.85;
            System.out.printf("Football %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("mixed") && students >= 20 && students < 50) {
            price = ((students * 15.00) * nights) * 0.85;
            System.out.printf("Swimming %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("girls") && students >= 50) {
            price = ((students * 7.20) * nights) * 0.50;
            System.out.printf("Athletics %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("boys") && students >= 50) {
            price = ((students * 7.20) * nights) * 0.50;
            System.out.printf("Tennis %.2f lv.", price);
        } if (season.equals("Spring") && group.equals("mixed") && students >= 50) {
            price = ((students * 9.50) * nights) * 0.50;
            System.out.printf("Cycling %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("girls") && students >= 50) {
            price = ((students * 15.00) * nights) * 0.50;
            System.out.printf("Volleyball %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("boys") && students >= 50) {
            price = ((students * 15.00) * nights) * 0.50;
            System.out.printf("Football %.2f lv.", price);
        } if (season.equals("Summer") && group.equals("mixed") && students >= 50) {
            price = ((students * 20.00) * nights) * 0.50;
            System.out.printf("Swimming %.2f lv.", price);
        }
    }
}
