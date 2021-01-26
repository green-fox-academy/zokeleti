package restproject.rest.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SithService {

    private List<String> yodaBullshit = new ArrayList<>(Arrays.asList(" Arrgh. Uhmm", " Err..err.err", " Hmmmm"));

    public String yodiFy(String text){
        List<String> listOfSentences = Arrays.asList(text.split("."));
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < listOfSentences.size(); i++){
            resultList.add(listOfSentences.get(i));
            resultList.add(yodaBullshit.get(i%3));
        }
        return String.join(".", resultList);
    }
}
