import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to find which number squared value is more then 20 from the following list:

public class FindSquaresAboveTwenty {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbersWithSquareAboveTwenty = numbers.stream()
                .filter(n -> n*n > 20)
                .collect(Collectors.toList());
        for(Integer number : numbersWithSquareAboveTwenty){
            System.out.println(number);
        }
    }
}
