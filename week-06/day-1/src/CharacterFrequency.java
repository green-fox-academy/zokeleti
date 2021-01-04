import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

//Write a Stream Expression to find the frequency of characters in a given string!
public class CharacterFrequency {
    public static void main(String[] args) {
        String string = "Happy new year for everyone";
        string.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
    }
}
    //groupingBy(x -> x, counting())