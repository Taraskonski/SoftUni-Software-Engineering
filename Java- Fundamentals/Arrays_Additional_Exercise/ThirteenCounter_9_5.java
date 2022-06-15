package Arrays;

public class ThirteenCounter_9_5 {
    public static void main(String[] args) {
        int arr[] = new int[400];

        int numFound = 0;
        int input = 1;

        while (numFound < 400) {
            if (input % 13 == 0) {
                arr[numFound] = input;
                numFound++;
            }
            input++;
        }
        System.out.println("First 400 multiples of 13 are:");
        for (int i = 0; i < 400; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
