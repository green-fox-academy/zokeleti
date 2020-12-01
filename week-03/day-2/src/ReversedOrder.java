import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedOrder {

    // Create a method that decrypts reversed-order.txt

    public static void reverse(String src, String dest){
        List<String> encryptedLines = new ArrayList<>();
        List<String> decryptedLines = new ArrayList<>();
        try {
            Path srcPath = Paths.get(src);
            encryptedLines = Files.readAllLines(srcPath);
        } catch (Exception e) {
            System.out.println("Problem while reading file");
        }
        for (int i = encryptedLines.size() - 1; i > -1; i--){
            decryptedLines.add(encryptedLines.get(i));
        }
        try {
            Path destPath = Paths.get(dest);
            Files.write(destPath, decryptedLines);
        } catch (Exception e) {
            System.out.println("Something went wrong while writing file");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the source file: ");
        String src = scanner.next();
        System.out.print("Please enter the name of the destination file: ");
        String dest = scanner.next();
        reverse(src, dest);


    }
}