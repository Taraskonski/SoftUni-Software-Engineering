package ProgrammingFundamentalsMidExam_02;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double sum = 0;
        for (int element : numberList) {
            sum += element;
        }
        double averageValue = sum / numberList.size();

        List<Integer> newList = new ArrayList<>();
        for (int element : numberList) {
            if (averageValue < element) {
                newList.add(element);
            }
        }
        Collections.sort(newList);
        Collections.reverse(newList);

        if (newList.size() < 5 && newList.size() > 1) {
            System.out.println(newList.toString().replace("[", "").replace("]", "").replace(",", ""));
        } else if (newList.isEmpty()){
            System.out.println("No");
        } else {
            newList = newList.stream().limit(5).collect(Collectors.toList());
            for (Integer num : newList) {
                System.out.printf("%d ", num);

            }
        }
    }

}
