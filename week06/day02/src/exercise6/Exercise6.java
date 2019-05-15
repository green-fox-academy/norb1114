package exercise6;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

        String string = "jdfsaéfsdSDFjkfdélkSDF";

        List<Character> upperCaseCharacters = string.chars()
                .filter(c -> Character.isUpperCase(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        System.out.println(upperCaseCharacters);
    }
}
