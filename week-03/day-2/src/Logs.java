import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Logs {

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

    public  static List<String> readFile(String src){
        List<String> lines = new ArrayList<>();
        try {
            Path srcPath = Paths.get(src);
            lines = Files.readAllLines(srcPath);
            return lines;
        } catch(Exception e){
            System.out.println("Something went wrong reading the file");
            return lines;
        }
    }

    public static String[] uniqueIps(String src){
        List<String> lines = readFile(src);
        List<String> Ips = new ArrayList<String>();
        for (String line : lines){
            Ips.add(line.split(" ")[8]);
            }
        List<String> result = new ArrayList<>();
        for (String Ip : Ips) {
            if (result.contains(Ip)) {
                continue;
            } else {
                result.add(Ip);
            }
        }
        String[] finalResult = new String[result.size()];
        finalResult = result.toArray(finalResult);
        System.out.println("allIps: " + finalResult.length);
        return finalResult;
    }


    public static double getPostRatio(String src){
        List<String> lines = readFile(src);
        int gets = 0;
        int posts = 0;
        for(String line : lines) {
            if (line.contains("GET")) {
                gets++;
            } else {
                posts++;
            }
        }
        return (double)gets/posts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the source file: ");
        String src = scanner.next();
        System.out.println("The array with unique Ips: " + Arrays.toString(uniqueIps(src)));
        System.out.println("The GET / POST ratio is " + getPostRatio(src));
    }
}
