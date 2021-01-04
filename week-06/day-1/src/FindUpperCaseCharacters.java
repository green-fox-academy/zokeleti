import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to find the uppercase characters in a string!
public class FindUpperCaseCharacters {
    public static void main(String[] args) {
        String string = "SoMeThIng HAppeNeD";

        List<Character> upperCharacters = string
                .chars()
                .mapToObj(item -> (char) item)
                .filter(c -> c.isUpperCase(c))
                .collect(Collectors.toList());

        for (Character character : upperCharacters){
            System.out.println(upperCharacters);
        }
    }
}


/*
        str.chars()
        .mapToObj(item -> (char) item)
        .collect(Collectors.toList())*/
