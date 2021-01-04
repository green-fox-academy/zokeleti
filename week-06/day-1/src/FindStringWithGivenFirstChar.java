//Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringWithGivenFirstChar {
    public static void main(String[] args) {
        String startChar = "a";
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
                                            "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI",
                                            "PARIS");
        List<String>citiesFound = cities
                .stream()
                .filter(string -> string.toLowerCase().startsWith(startChar))
                .collect(Collectors.toList());
        citiesFound.forEach(System.out::println);

    }
}
