package charactercounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        System.out.println(mostCommonCharacter("./src/countchar.txt"));

    }

    public static char mostCommonCharacter(String fileName){

        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try {
            lines.addAll(Files.readAllLines(filePath));

        }catch (IOException ex){
            System.out.println("file does not exits");
        }
        List<Integer>  occurence = new ArrayList<>();

        String allText = "";

        for (String line :
                lines) {
            allText += line;
        }
        Map<Character, Integer> results = new HashMap<>(); //rainyCities
        char[] characters = allText.toCharArray();

        for (char actualCharacter :
                characters) {
            if (results.containsKey(actualCharacter)){
                int oldValue = results.get(actualCharacter);
                results.put(actualCharacter, oldValue +1);
            }else {
                results.put(actualCharacter, 1);
            }
        }
        Character mostCommonCharacter = null;
        int mostCommon = 0;
        for (char letter:results.keySet()) {
            if (mostCommon < results.get(letter)){
                mostCommon = results.get(letter);
                mostCommonCharacter = letter;
            }

        }

     return mostCommonCharacter;
    }

}