
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {

    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try{
            Path filePath = Paths.get("bananas");
            lines = Files.readAllLines(filePath);
        } catch (Exception e){
            System.out.println("Unable to read file: my-file.txt");
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
