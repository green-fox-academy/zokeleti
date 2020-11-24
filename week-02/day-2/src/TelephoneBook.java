import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, String> tBook = new HashMap<>();
        tBook.put("William A. Lathan", "405-709-1865");
        tBook.put("John K. Miller", "402-247-8568");
        tBook.put("Hortensia E. Foster", "606-481-6467");
        tBook.put("Amanda D. Newland", "319-243-5613");
        tBook.put("Brooke P. Askew", "307-687-2982");
        System.out.println("John K. Millers phone number: " + tBook.get("John K. Miller"));
        for (Map.Entry<String, String> entry : tBook.entrySet()){
            String name = entry.getKey();
            String number = entry.getValue();
            if (number.equals("307-687-2982")){
                System.out.println(name);
            }
        }
        tBook.containsKey("Chris E. Myers");
    }
}
