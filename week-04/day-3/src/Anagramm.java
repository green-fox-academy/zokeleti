import java.util.Arrays;


public class Anagramm {

    public  boolean areAnagramms(String string1, String string2){
        char[] string1array = string1.toLowerCase().toCharArray();
        Arrays.sort(string1array);
        char[] string2array = string2.toLowerCase().toCharArray();
        Arrays.sort(string2array);
        return Arrays.equals(string1array, string2array);

    }
}
