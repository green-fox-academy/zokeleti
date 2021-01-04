import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Write a Stream Expression to get the squared value of the positive numbers from the following list:

public class SquareOfPositives {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> positiveSquares = numbers.stream().filter(n -> n > 0).map(n -> n * n).collect(Collectors.toList());
        for(Integer positiveSquare : positiveSquares){
            System.out.println(positiveSquare);
        }
    }
}
