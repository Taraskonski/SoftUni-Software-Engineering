package Arrays;

public class WheelOfFortune_9_3 {
    public static void main(String[] args) {
        String phrase[] = {"USING EMAIL ETIQUETTE",
                "GENERAL INFORMATION",
                "GRAMMAR TOOLS",
                "GRAMMAR BOOK E-NEWSLETTER",
                "ARE YOU READY FOR THE QUIZ",
                "SYNONYM OF THE DAY"};

        int letterCount[] = new int[26];
        for (int count = 0; count <= phrase.length - 1; count++) {
            String current = phrase[count];
            char letters[] = current.toCharArray();
            for (int secondCount = 0; secondCount <= letters.length - 1; secondCount++) {
                char letter = letters[secondCount];
                if ((letter >= 'A') & (letter <= 'Z')) {
                    letterCount[letter - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'Z'; count++) {
            System.out.print(count + ": " + letterCount[count - 'A'] + " ");
            if (count == 'M') {
                System.out.println();
            }
        }
        System.out.println();
    }
}
