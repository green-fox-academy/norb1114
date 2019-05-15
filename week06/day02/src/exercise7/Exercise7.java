package exercise7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        List<String> citiesStartsWithA = cities.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(citiesStartsWithA);
    }
}
