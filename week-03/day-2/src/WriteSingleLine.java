
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class WriteSingleLine {

    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the file to be modified: ");
        String fileName = scanner.next();
        System.out.print("Please enter your name: ");
        String yourName = scanner.next();
        List<String> yourNameList = new ArrayList<>(Arrays.asList(yourName));
        try{
            Path filePath = Paths.get(fileName);
            Files.write(filePath, yourNameList);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}