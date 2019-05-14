package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    // Your task is to clean up the data and print the chip usage to the console in a more readable format.
    //
    // Each line represents an entry and contains the following information:
    // Id,Date and Time,Event message,Event number,Object #1,Description #1,Object #2,Description #2,Object #3,Description #3,Object #4,Description #4,Card number
    // 1,2019.01.02. 9:21:49,Access granted,203,12,A66 - 04 FOBEJÁRAT (F-1) Door #1,5,Czender András,0,,0,,00215:09895
    //
    // During the development you will need only a two fields from the input:
    // Description #1 - the used door
    // Card number

    // Your task is to count how many times a chip was used at the main door
    // (A66 - 04 FOBEJÁRAT (F-1) Door #1)
    // Card number : number of usage

    // Minden kulcshoz megszámoljuk, hogy hánszor volt használva a főbejáratnál

    public static void main(String[] args) {
        Path path = Paths.get("Content.txt");
        List<String> keyUsages = new ArrayList<>();

        try{
            // Read all text from the file
            // Every String in the list is one line from the file
            keyUsages = Files.readAllLines(path);

        } catch (IOException ex) {
            System.err.println("Hujjujj");
            //System.err.println(ex.getMessage());
            //System.out.println("Hajjaj");
        }


        // build allData
        List<String[]> allData = new ArrayList<>();
        for (String line : keyUsages) {
            String[] usage = line.split(",");
            allData.add(usage);
        }

        // For each key
        // count usages where the Object #1 == A66 - 04 FOBEJÁRAT (F-1) Door #1
        // Register data in the map (key, usage)

        String door = "A66 - 04 FOBEJÁRAT (F-1) Door #1";
        Map<String, Integer> result = new HashMap<>();


        // Select the key we need to count
        // With Foreach
        /*for (String[] line : allData) {
            int cardNUmberIndex = line.length-1;
            String cardNumber = line[cardNUmberIndex];
            int counter = 0;

            if (! result.containsKey(cardNumber)){
                // do the counting work
                for (String[] checkedLine : allData) {
                    if (checkedLine[5].equals(door) && cardNumber.equals(checkedLine[cardNUmberIndex])){
                        counter++;
                    }
                }

                result.put(cardNumber, counter);
            }
        }*/

        // With For:
        for (int i = 0; i < allData.size() ; i++) {

            int cardNUmberIndex = allData.get(i).length-1;
            String cardNumber = allData.get(i)[cardNUmberIndex];
            int counter = 0;

            if (! result.containsKey(cardNumber)){
                // do the counting work
                for (int j = 0; j <allData.size(); j++) {
                    if (allData.get(j)[5].equals(door) && cardNumber.equals(allData.get(j)[cardNUmberIndex])){
                        counter++;
                    }
                }

                result.put(cardNumber, counter);
            }
        }

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry);
        }

        /*
        // Print results
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry);
            // Print key:
            System.out.println(entry.getKey());
            // Print value:
            System.out.println(entry.getValue());
        }

        // Note : print keys:
        for (String key : result.keySet()) {
            System.out.println(key);
        }

        // Note : print values:
        for (Integer value : result.values()) {
            System.out.println(value);
        }*/

        // Practice parse - first 5 rows data
        int sum = 0;
        int max = 0;

        for (int i = 0; i < 5 ; i++) {
            String ezSzamLesz = allData.get(i)[6];
            int actual = 0;

            try{
                actual = Integer.parseInt(ezSzamLesz);
            } catch (Exception ex) {
                System.err.println("Error while parsing data");
            }

            if (i == 0){
                max = actual;
            }

            sum += actual;
            if (actual > max) {
                max = actual;
            }
        }
    }

    public static int alma(int a){
        return 6;
    }
}