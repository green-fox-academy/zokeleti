public class Strings3 {

    // Given a string,
// compute recursively a new string where
// all the adjacent chars are now separated by a `*`

    public static String addSeparator(String string){
        if (string.length() == 1){
            return string.substring(0, 1);

        } else {
            return addSeparator(string.substring(0, string.length()-1)) + "*" + string.substring(string.length()-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(addSeparator("valami"));

    }
}
