package Arrays;

public class StudentsGrader_9_4 {
    public static void main(String[] args) {
        int countOfStudents = 10;
        double student[][] = new double[countOfStudents][countOfStudents];
        double[] Ivan = {3, 4, 5.5, 2, 3, 6, 3, 6, 4, 5};
        double[] Jim = {3, 6, 3, 6, 4, 5, 3, 4, 5.5, 2};
        double[] Monika = {3, 4, 5.5, 2, 3, 6, 3, 6, 4, 5};
        double[] Dani = {3, 4, 3.5, 2, 3, 6, 3, 6, 4, 5};
        double[] Alex = {3, 4, 5.5, 2, 2, 6, 3, 3, 4, 5};
        double[] Honda = {6, 4, 5, 2, 3, 6, 3, 6, 4, 5};
        double[] Suzuki = {2, 4, 6, 2, 3, 6, 3, 6, 4, 5};
        double[] Mazda = {3, 4, 4, 2, 3, 6, 3, 6, 4, 2};
        double[] John = {3, 4, 2, 2, 3, 6, 3, 6, 4, 6};
        double[] Dan = {3, 4, 6, 2, 3, 6, 3, 6, 2, 5};
        student[0] = Ivan;
        student[1] = Jim;
        student[2] = Monika;
        student[3] = Dani;
        student[4] = Alex;
        student[5] = Honda;
        student[6] = Suzuki;
        student[7] = Mazda;
        student[8] = John;
        student[9] = Dan;

        double gradeSum = 0;
        double studentsSum[] = new double[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            System.out.println("Student №" + (i + 1));
            studentsSum[i] = 0;

            for (int j = 0; j < countOfStudents; j++) {
                gradeSum += student[i][j];
                studentsSum[i] += student[i][j];
            }
            System.out.println(" Average grade: " + studentsSum[i] / countOfStudents);
        }
        System.out.println("\nAverage grade of all students: " + gradeSum / (countOfStudents * countOfStudents));
    }
}
