import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        List<String> myListA = new ArrayList<>();
        myListA.addAll(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        List<String> myListB = new ArrayList<>(myListA);
        System.out.println(myListA.contains("Durian"));
        myListB.remove("Durian");
        myListA.add(4, "Kiwifruit");
        System.out.println("Size A: " + myListA.size() + " Size B: " + myListB.size());
        System.out.println("index of Avocado on list A: " + myListA.indexOf("Avocado"));
        System.out.println("index of Durian on list B: " + myListB.indexOf("Durian"));
        myListB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(myListA.get(2));


    }
}
