import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedLines {

    // Create a method that decrypts reversed-lines.txt

    public static void decrypt(String encrypted, String decrypted){
        List<String> encryptedLines = new ArrayList<>();
        List<String> decryptedLines = new ArrayList<>();
        try {
            Path srcPath = Paths.get(encrypted);
            encryptedLines = Files.readAllLines(srcPath);
        } catch(Exception e) {
            System.out.println("Something went wrong with the reading");
        }
        for (String line : encryptedLines){
            String decryptedLine = "";
            for (int i = line.length()-1; i > -1; i--){
                decryptedLine = decryptedLine + line.charAt(i);
            }
            decryptedLines.add(decryptedLine);
        }
        try{
            Path destPath = Paths.get(decrypted);
            Files.write(destPath, decryptedLines);
        } catch (Exception e){
            System.out.println("Something went wrong with the writing");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the encrypted file: ");
        String encrypted = scanner.next();
        System.out.print("Please enter the name of the file you wish to decrypt to: ");
        String decrypted = scanner.next();
        decrypt(encrypted, decrypted);

    }
}