import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to get the average value of the odd numbers from the following list:
public class AverageOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        Double averageOfOddNumbers = numbers.stream()
                .filter(n -> n % 2 == 1 || n % 2 == -1)
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(averageOfOddNumbers);
    }
}
