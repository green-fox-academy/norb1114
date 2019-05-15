package exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {

        List<Character> somethingCharacters = Arrays.asList('s', 'o', 'm', 'e', 't', 'h', 'i', 'n', 'g');

        String something = somethingCharacters.stream()
                .map(m -> m.toString())
                .collect(Collectors.joining());

        System.out.println(something);
    }
}
