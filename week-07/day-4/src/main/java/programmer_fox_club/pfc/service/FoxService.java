package programmer_fox_club.pfc.service;

import org.springframework.stereotype.Service;
import programmer_fox_club.pfc.model.Drinks;
import programmer_fox_club.pfc.model.Foods;
import programmer_fox_club.pfc.model.Fox;
import programmer_fox_club.pfc.model.Tricks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxService {
    private List<Fox> foxes = new ArrayList<>();

    public Fox findFoxByName(String name){
        Fox result = foxes
                .stream()
                .filter(fox -> fox.getName().equals(name))
                .findFirst()
                .orElse(new Fox(name));
        return result;
    }

    public Boolean addFox(Fox foxToAdd){
        if(!foxes.contains(foxToAdd)) {
            foxes.add(foxToAdd);
            return true;
        }
        return false;
    }

    public void addToTrickList(String name, String trick){
        findFoxByName(name).addToTrick(trick);
    }

    public List<String> getFoodList(){
        return Arrays.stream(Foods.values())
                .map(Enum::toString)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public List<String> getDrinkList(){
        return Arrays.stream(Drinks.values())
                .map(Enum::toString)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public List<String> getTrickList(){
        return Arrays.stream(Tricks.values())
                .map(Enum::toString)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}
