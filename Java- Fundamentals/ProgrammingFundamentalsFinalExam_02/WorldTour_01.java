package ProgrammingFundamentalsFinalExam_02;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder trip = new StringBuilder(sc.nextLine());
        String input = sc.nextLine();

        while (!input.equals("Travel")) {
            String[] stops = input.split(":");

            switch (stops[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(stops[1]);
                    if (index >= 0 && index < trip.length()) {
                        trip.insert(index, stops[2]);
                    }
                    System.out.println(trip);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(stops[1]);
                    int lastIndex = Integer.parseInt(stops[2]);
                    if (startIndex >= 0 && lastIndex >= 0 && startIndex < trip.length() && lastIndex < trip.length()) {
                        trip.delete(startIndex, lastIndex + 1);
                    }
                    System.out.println(trip);
                    break;
                case "Switch":
                    trip.replace(trip.indexOf(stops[1]), trip.indexOf(stops[1]) + stops[1].length(), stops[2]);
                    System.out.println(trip);
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", trip);
    }
}
