import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());
        int exam = (hourExam * 60) + minuteExam;
        int arrive = (hourArrive * 60) + minuteArrive;
        int diff = arrive - exam;

        if (diff < -30) {
            System.out.println("Early");
        } else if (diff <= 0) {
            System.out.println("On time");
        } else {
            System.out.println("Late");
        }
        if (diff != 0) {
            int hours = Math.abs(diff / 60);
            int minutes = Math.abs(diff % 60);
            if (hours > 0) {
                if (minutes < 10) {
                    System.out.print(hours + ":0" + minutes + " hours");
                    if (diff < 0) {
                        System.out.print(" before the start");
                    } else {
                        System.out.print(" after the start");
                    }
                } else {
                    System.out.print(hours + ":" + minutes + " hours");
                    if (diff < 0) {
                        System.out.print(" before the start");
                    } else {
                        System.out.print(" after the start");
                    }
                }
            } else {
                System.out.print(minutes + " minutes");
                if (diff < 0) {
                    System.out.print(" before the start");
                } else {
                    System.out.print(" after the start");
                }
            }
        }
    }
}

