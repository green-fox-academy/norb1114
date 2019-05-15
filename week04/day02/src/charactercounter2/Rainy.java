package charactercounter2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rainy{
    public static void main(String[] args) {

        System.out.println(mostRainyCity("./src/cities"));
    }

    public static String mostRainyCity (String fileName){

        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try{
            lines.addAll(Files.readAllLines(filePath));
        }catch (IOException ex){
            System.out.println("Couldn't find this file.");
        }

        Map<String, Integer> rainyCities = new HashMap<>();
        List<Integer> days = new ArrayList<>();

        for(String line : lines){
            String[] splitArray = line.split(",");

            String[] dates = splitArray[0].split("-");

            int day = 0;
            try {
                day = Integer.parseInt(dates[2]);
            } catch (NumberFormatException ex) {}

            days.add(day);

            if(rainyCities.containsKey(splitArray[1]) && splitArray[2].equals("RAINY")) {
                rainyCities.put(splitArray[1], rainyCities.get(splitArray[1]) + 1);
            } else if(!rainyCities.containsKey(splitArray[1]) && splitArray[2].equals("RAINY")) {
                rainyCities.put(splitArray[1], 1);
            }
        }

        String mostRainyCity = "";
        int mostRainy = 0;
        for (String city : rainyCities.keySet())
            if (mostRainy < rainyCities.get(city)) {
                mostRainy = rainyCities.get(city);
                mostRainyCity = city;
            }

        String isIt15 = "";

        for(int day : days) {
            if(day == 15) {
                isIt15 = "Day 15 is in list";
            }
        }

        return mostRainyCity + " " +  isIt15;

    }
}

//Write a method which can read and parse a file containing information about
//weather in various cities. The method must return the name of the city which
//had the most rainy days.
