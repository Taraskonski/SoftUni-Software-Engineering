import java.util.Scanner;

public class ConStAdv03Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chriz = Double.parseDouble(sc.nextLine());
        double roses = Double.parseDouble(sc.nextLine());
        double tulips = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String holiday = sc.nextLine();

        double chrizPrice = 0;
        double rosesPrice = 0;
        double tulipsPrize = 0;
        double discount = 0;
        double price = 0;

        switch ( season ) {
            case "Spring" :
            case "Summer" :
                chrizPrice = 2.00;
                rosesPrice = 4.10;
                tulipsPrize = 2.50;
                break;
            case "Autumn" :
            case "Winter" :
                chrizPrice = 3.75;
                rosesPrice = 4.50;
                tulipsPrize = 4.15;
                break;
        } price = (chriz * chrizPrice) + (roses * rosesPrice) + (tulips * tulipsPrize);
        if (holiday.equals("Y")) {
            price = price * 1.15;
        } if (season.equals("Spring") && tulips >7) {
            discount = price * 0.05;
            price = price - discount;
        } if (season.equals("Winter") && roses >= 10) {
            discount = price * 0.10;
            price = price - discount;
        } if ((chriz + roses + tulips) > 20) {
            discount = price * 0.20;
            price = price - discount;
        }
        System.out.printf("%.2f", price + 2);
    }
}
