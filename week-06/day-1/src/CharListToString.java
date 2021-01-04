import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharListToString {
    public static void main(String[] args) {
        List<Character> characterList = Arrays.asList('V', 'B', 'f', 'y', 'o', 'q', 'X');
        System.out.println(characterList.stream().map(String::valueOf).collect(Collectors.joining()));
    }

}
