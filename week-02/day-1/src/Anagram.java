public class Anagram {
    public static String[] toLetters(String word){
        String[] resArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++ ){
            resArray[i] = String.valueOf(word.charAt(i));
        }
    }
    public static boolean isAnagram(String a, String b){

    }
    public static void main(String[] args) {

    }
}
