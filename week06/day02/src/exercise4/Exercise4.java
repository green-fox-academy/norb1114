package exercise4;

import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double doubleOfOddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToDouble(n->n)
                .average()
                .getAsDouble();
        System.out.println(doubleOfOddNumbers);

        double doubleOfOddNumbers2 = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .getAsDouble();
        System.out.println(doubleOfOddNumbers2);

        double doubleOfOddNumbers3 = numbers.stream()
                .filter(n -> n %2 != 0)
                .mapToDouble(n -> n)
                .summaryStatistics()
                .getAverage();
        System.out.println(doubleOfOddNumbers3);
    }
}
