import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

    // Create a function that takes 3 parameters: a path, a word and a number
    // and is able to write into a file.
    // The path parameter should be a string that describes the location of the file you wish to modify
    // The word parameter should also be a string that will be written to the file as individual lines
    // The number parameter should describe how many lines the file should have.
    // If the word is 'apple' and the number is 5, it should write 5 lines
    // into the file and each line should read 'apple'
    // The function should not raise any errors if it could not write the file.

    public static void writeLines(String path, String word, int number){
        List<String> linesToWrite = new ArrayList<>();
        for (int i = 0; i < number; i++){
            linesToWrite.add(i, word);
        }
        try{
            Path filePath = Paths.get(path);
            Files.write(filePath, linesToWrite);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the file: ");
        String path = scanner.next();
        System.out.print("Please enter the word you would like to copy: ");
        String word = scanner.next();
        System.out.print("Please enter the number of lines you want to copy the word given above: ");
        int number = scanner.nextInt();
        writeLines(path, word, number);
    }
}
