import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {

    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    public static boolean copyFile(String fromFile, String toFile){
        List<String> linesToCopy = new ArrayList<>();
        try {
            Path fromPath = Paths.get(fromFile);
            Path toPath = Paths.get(toFile);
            linesToCopy = Files.readAllLines(fromPath);
            Files.write(toPath, linesToCopy);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the file you wish to copy from: ");
        String src = scanner.next();
        System.out.print("Please enter the name of the file you wish to copy to: ");
        String dest = scanner.next();
        System.out.println(copyFile(src, dest));

    }
}
