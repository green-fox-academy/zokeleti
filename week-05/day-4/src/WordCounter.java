import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCounter {
    /*Word Frequency
    Write a method which can read and parse a file. The method must take a frequency
    as a parameter and collects all of the words that appear in that amount of times in the source file.
    It shall write the selected words into output.txt.
    If there is no word present with the given frequency it shall not do anything.
    The method must be able to handle the case if the input file name does not exists.*/

    public void wordCounter(int n){
        Path inputPath = Paths.get("input.txt");
        List<String> fileContent = new ArrayList<>();
        Map<String, Integer> occurences = new HashMap<>();
        try {
            fileContent = Files.readAllLines(inputPath);
        } catch (Exception e) {
            System.out.println("Something went wrong reading the file");
        }
        for(String line : fileContent){
            List<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
            for (String word : words){
                if(occurences.containsKey(word)){
                    occurences.put(word, occurences.get(word)+1);
                } else {
                    occurences.put(word, 1);
                }
            }
        }
        String wordsToReturn = "";
        for(Map.Entry entry : occurences.entrySet()){
            if(entry.getValue().equals(n)){
                wordsToReturn = wordsToReturn + entry.getKey() + ", ";
            }
        }
        if(wordsToReturn.length()>0){
            Path outputPath = Paths.get("output.txt");
            try{
                Files.write(outputPath, Collections.singleton(wordsToReturn));
            } catch (Exception e){
                System.out.println("Something went wrong writing the file");
            }
        }
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.wordCounter(2);
    }

}
