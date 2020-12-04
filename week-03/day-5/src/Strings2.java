public class Strings2 {

    // Given a string,
// compute recursively a new string where
// all the 'x' chars have been removed.

    public static String removeX(String string){
        if (string.length() == 0){
            return "";
        } else if (string.endsWith("x")) {
            return removeX(string.substring(0, string.length()-1));
        } else{
            return removeX(string.substring(0, string.length()-1)) + string.substring(string.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(removeX("xerxex"));
    }
}
