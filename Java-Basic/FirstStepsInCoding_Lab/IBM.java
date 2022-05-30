import java.util.Scanner;

public class IBM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double bmi = weight / (height * height);

        if ("мъж".equals(gender)) {
            if (age <= 24) {
                System.out.printf("Индексът на телесна мазнина е: %.2f ", bmi);
                System.out.println();
                System.out.println("СТОЙНОСТИ НА ИТМ (BMI) ЗА МЪЖЕ НАД 20Г. СПОРЕД ВЪЗРАСТТА");
                System.out.println();
                System.out.println("Възраст от 20 до 24 години:");
                System.out.println("Поднормено тегло - ИТМ по-малко от 20");
                System.out.println("Нормално тегло - ИТМ от 20 до 25");
                System.out.println("Наднормено тегло - ИТМ от 25 до 30");
                System.out.println("Затлъстяване - ИТМ от 30 до 40");
                System.out.println("Тежко затлъстяване - ИТМ по-голямо от 40");
            } if ((age > 24) && (age <= 34)) {
                System.out.printf("Индексът на телесна мазнина е: %.2f ", bmi);
                System.out.println();
                System.out.println("СТОЙНОСТИ НА ИТМ (BMI) ЗА МЪЖЕ НАД 20Г. СПОРЕД ВЪЗРАСТТА");
                System.out.println();
                System.out.println("Възраст от 25 до 34 години:");
                System.out.println("Поднормено тегло - ИТМ по-малко от 21");
                System.out.println("Нормално тегло - ИТМ от 21 до 26");
                System.out.println("Наднормено тегло - ИТМ от 26 до 31");
                System.out.println("Затлъстяване - ИТМ от 31 до 41");
                System.out.println("Тежко затлъстяване - ИТМ по-голямо от 41");
            } if ((age > 35) && (age <= 44)) {
                System.out.printf("Индексът на телесна мазнина е: %.2f ", bmi);
                System.out.println();
                System.out.println("СТОЙНОСТИ НА ИТМ (BMI) ЗА МЪЖЕ НАД 20Г. СПОРЕД ВЪЗРАСТТА");
                System.out.println();
                System.out.println("Възраст от 35 до 44 години:");
                System.out.println("Поднормено тегло - ИТМ по-малко от 22");
                System.out.println("Нормално тегло - ИТМ от 22 до 27");
                System.out.println("Наднормено тегло - ИТМ от 27 до 32");
                System.out.println("Затлъстяване - ИТМ от 32 до 42");
                System.out.println("Тежко затлъстяване - ИТМ по-голямо от 42");
            } if ((age > 45) && (age <= 54)) {
                System.out.printf("Индексът на телесна мазнина е: %.2f ", bmi);
                System.out.println();
                System.out.println("СТОЙНОСТИ НА ИТМ (BMI) ЗА МЪЖЕ НАД 20Г. СПОРЕД ВЪЗРАСТТА");
                System.out.println();
                System.out.println("Възраст от 45 до 54 години:");
                System.out.println("Поднормено тегло - ИТМ по-малко от 23");
                System.out.println("Нормално тегло - ИТМ от 23 до 28");
                System.out.println("Наднормено тегло - ИТМ от 28 до 33");
                System.out.println("Затлъстяване - ИТМ от 33 до 43");
                System.out.println("Тежко затлъстяване - ИТМ по-голямо от 43");
            } if ((age > 55) && (age <= 64)) {
                System.out.printf("Индексът на телесна мазнина е: %.2f ", bmi);
                System.out.println();
                System.out.println("СТОЙНОСТИ НА ИТМ (BMI) ЗА МЪЖЕ НАД 20Г. СПОРЕД ВЪЗРАСТТА");
                System.out.println();
                System.out.println("Възраст от 55 до 64 години:");
                System.out.println("Поднормено тегло - ИТМ по-малко от 24");
                System.out.println("Нормално тегло - ИТМ от 24 до 29");
                System.out.println("Наднормено тегло - ИТМ от 29 до 34");
                System.out.println("Затлъстяване - ИТМ от 34 до 44");
                System.out.println("Тежко затлъстяване - ИТМ по-голямо от 44");
            } if (age >= 65) {
                System.out.printf("Индексът на телесна мазнина е: %.2f ", bmi);
                System.out.println();
                System.out.println("СТОЙНОСТИ НА ИТМ (BMI) ЗА МЪЖЕ НАД 20Г. СПОРЕД ВЪЗРАСТТА");
                System.out.println();
                System.out.println("Възраст от 65+ години:");
                System.out.println("Поднормено тегло - ИТМ по-малко от 25");
                System.out.println("Нормално тегло - ИТМ от 25 до 30");
                System.out.println("Наднормено тегло - ИТМ от 30 до 35");
                System.out.println("Затлъстяване - ИТМ от 35 до 45");
                System.out.println("Тежко затлъстяване - ИТМ по-голямо от 45");
            } else {
                System.out.println();
            } if ("f".equals(gender)) {
                if (age <= 24) {
                    System.out.println("error");
                    System.out.printf("Индексът на телесна мазнина е: %.2f ", bmi);
                }
            }
        }
    }
}

