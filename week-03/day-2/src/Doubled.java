import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doubled {

    // Create a method that decrypts the duplicated-chars.txt

    public static void decrypt(String encrypted, String decrypted){
        List<String> listOfEncryptedLines = new ArrayList<>();
        List<String> listOfDecryptedWords = new ArrayList<>();
        try{
            Path srcPath = Paths.get(encrypted);
            listOfEncryptedLines = Files.readAllLines(srcPath);
        } catch(Exception e) {
            System.out.println("Ooops, something went wrong with reading");
        }
        for(String encryptedLine : listOfEncryptedLines){
            String decryptedLine = "";
            for (int i = 0; i < encryptedLine.length(); i += 2){
                decryptedLine = decryptedLine + encryptedLine.charAt(i);
            }
            listOfDecryptedWords.add(decryptedLine);
        }
        try{
            Path destPath = Paths.get(decrypted);
            Files.write(destPath, listOfDecryptedWords);
        } catch (Exception e){
            System.out.println("Ooops, something went wrong with writing");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the file you wish to decrypt: ");
        String encrypted = scanner.next();
        System.out.print("Please enter the name of the file you wish to write the encrypted text: ");
        String decrypted = scanner.next();
        decrypt(encrypted, decrypted);

    }
}