import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which solves the following problems.
//        How much did we spend?
//        Which was our greatest expense?
//        Which was our cheapest spending?
//        What was the average amount of our spendings?

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> expenses = new ArrayList<>();
        expenses.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        int sum = 0;
        Collections.sort(expenses);
        for (int expense : expenses){
            sum += expense;
        }
        System.out.println("Overall spending: " + sum);
        System.out.println("The biggest expense is: " + expenses.get(expenses.size()-1));
        System.out.println("The smallest spending is: " + expenses.get(0));
        System.out.println("The average amount of spendign is: " + sum / expenses.size());
    }
}
