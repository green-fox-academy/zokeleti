import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

        Write a Stream Expression to find the foxes with green color!
        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        Write a Stream Expression to find the frequency of foxes by color!*/

public class Main {
    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Vuk", "red", 3));
        foxes.add(new Fox("Karak", "red", 7));
        foxes.add(new Fox("Balayev", "silver", 1));
        foxes.add(new Fox("Macseb", "green", 4));
        foxes.add(new Fox("UFO", "green", 8));

        List<Fox> greenFoxes = foxes
                .stream()
                .filter(fox -> fox.color.equals("green"))
                .collect(Collectors.toList());

        List<Fox> youngGreenFoxes = foxes
                .stream()
                .filter(fox -> fox.color.equals("green") && fox.age < 5)
                .collect(Collectors.toList());

        Map<String, List<Fox>> foxesByColor = foxes
                .stream()
                .collect(Collectors.groupingBy(fox -> fox.color));

        greenFoxes.forEach(System.out::println);
        youngGreenFoxes.forEach(System.out::println);
        foxesByColor.forEach((color, fox) -> System.out.format("color %s : %s \n", color, fox ));

    }
}
