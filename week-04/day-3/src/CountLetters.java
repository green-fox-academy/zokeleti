import java.util.HashMap;

/*Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
        Create a test for that.*/

public class CountLetters {
    public HashMap<Character, Integer> countLetters(String origString){
        String string = origString.toLowerCase();
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < string.length(); i++){
            Character currentCharacter = string.charAt(i);
            if (!result.containsKey(currentCharacter)){
                result.put(currentCharacter, 1);
            } else {
                result.put(currentCharacter,result.get(currentCharacter) + 1);
            }
        }
        return result;
    }
}
