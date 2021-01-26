package restproject.rest.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SithService {

    private List<String> yodaBullshit = new ArrayList<>(Arrays.asList(" Arrgh. Uhmm", " Err..err.err", " Hmmmm"));

    public String yodiFy(String text){
        List<String> listOfSentences = switchPairsInSentences(Arrays.asList(text.split("\\.")));
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < listOfSentences.size(); i++){
            resultList.add(listOfSentences.get(i));
            resultList.add(yodaBullshit.get(i % 3));
        }
        return String.join(".", resultList);
    }

    public List<String> switchPairsInSentences(List<String> stringsToSwitch){
        List<String> result = new ArrayList<>();
        for(String sentence : stringsToSwitch){
            List<String> subResult = new ArrayList<>();
            List<String> words = Arrays.asList(sentence.split(" "));
            for(int i = 0; i < words.size()/2; i++){
                subResult.add(words.get(i*2));
                subResult.add(words.get(i*2+1));
            }
            if (words.size()%2 !=0){
                subResult.add(words.get(subResult.size()-1));
            }
            result.add(String.join(" ", subResult));

        }
        return result;
    }


}
