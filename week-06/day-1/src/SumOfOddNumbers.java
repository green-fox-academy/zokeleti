
//Write a Stream Expression to get the sum of the odd numbers in the following list:

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        Integer sumOfOddNumbers = numbers
                .stream()
                .filter(n -> n % 2 == 1 || n % 2 == -1)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sumOfOddNumbers);
    }
}
