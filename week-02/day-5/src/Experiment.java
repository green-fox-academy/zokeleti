import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Experiment
{
    public static String reverseWords(final String original)
    {
        List<String> wordsList = new ArrayList<>(Arrays.asList(original.split(" ")));
        List<String> reversedWordsList = new ArrayList<>();
        for (int i = 0; i < wordsList.size(); i++){
            List<String> lettersList = new ArrayList<>(Arrays.asList(wordsList.get(i).split("")));
            String reversedWord = "";
            for (int j = lettersList.size() - 1; j <= 0; j--){
                reversedWord = reversedWord + lettersList.get(j);
            }
            reversedWordsList.add(reversedWord);
        }
        String result = "";
        for (String reversedWord : reversedWordsList){
            result = result + reversedWord;
        }
        return result;
        // Have at it
    }
}