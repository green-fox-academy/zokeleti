import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
//    We are going to represent a shopping list in a list containing strings.
//
//    Create a list with the following items.
//            Eggs, milk, fish, apples, bread and chicken
//    Create an application which solves the following problems.
//    Do we have milk on the list?
//    Do we have bananas on the list?
    public static void main(String[] args) {
        List<String> shoppinList = new ArrayList<>();
        shoppinList.addAll(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        boolean gotMilk = shoppinList.contains("milk");
        if (gotMilk == false){
            System.out.println("milk is not on the list");
        } else {
            System.out.println("milk is on the list");
        }
        boolean gotBanana = shoppinList.contains("bananas");
        if (gotBanana == false){
            System.out.println("bananas are not on the list");
        } else {
            System.out.println("bananas are on the list");
        }
    }
}
