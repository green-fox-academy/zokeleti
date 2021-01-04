import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to get the even numbers from the following list:

public class EvenNumberStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        for (Integer evenNumber : evenNumbers){
            System.out.println(evenNumber);
        }
    }
}
