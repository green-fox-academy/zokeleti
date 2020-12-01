import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    public static int countLinesFunct(String filename){
        List<String> lines;
        int result = 0;
        try{
            Path filePath = Paths.get(filename);
            lines = Files.readAllLines(filePath);
        } catch(Exception e){
            return result;
        }
        return lines.size();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the file you would like to count the lines of: ");
        String fileName = scanner.next();
        System.out.println(countLinesFunct(fileName));
    }
}
