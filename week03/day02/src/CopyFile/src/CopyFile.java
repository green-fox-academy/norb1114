// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class CopyFile {
    public static void main (String []args) {

        Path filePath = Paths.get("hbkj.txt");
        Path targetPath = Paths.get("rrt.txt");
        boolean result = fileCopy(filePath, targetPath);

    }


    private static boolean fileCopy (Path sourcePath, Path targetPath) {

        try {


            Files.copy(sourcePath, targetPath);

           return true;

        }catch (Exception ex) {
            return false;
        }
    }
}
