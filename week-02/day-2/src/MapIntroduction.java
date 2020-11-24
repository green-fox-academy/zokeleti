import java.util.HashMap;
import java.util.Map;

public class MapIntroduction {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(97, "a");
        myMap.put(98, "b");
        myMap.put(99, "c");
        myMap.put(65, "A");
        myMap.put(66, "B");
        myMap.put(67, "C");
        for (Map.Entry<Integer, String> entry : myMap.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("This is the key: " + key + " And this is the value: " + value);
        }
        myMap.put(68, "D");
        System.out.println("There are " + myMap.size() + " entires in this map");
        System.out.println("The value associated with key 99: " + myMap.get(99));
        myMap.remove(97);
        System.out.println(myMap.containsKey(100));
        myMap.clear();
    }
}
