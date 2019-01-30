import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {

        Path filePath = Paths.get("file.txt");

        System.out.println(linesInFile("file.txt"));
    }

    public static int linesInFile(String filename){
        try {
            return (int) Files.lines(Paths.get(filename)).count();
        }catch (Exception ex){
            return 0;
        }
    }
}
