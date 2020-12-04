public class Strings {

    // Given a string, compute recursively (no loops) a new string where
// all the lowercase 'x' chars have been changed to 'y' chars.

    public static String xToY(String string){
        if (string.length() == 0){
            return "";
        }
        else if (string.substring(string.length()-1).equals("x")){
            return xToY(string.substring(0, string.length()-1)) + "y";
        } else {
            return xToY(string.substring(0, string.length()-1)) + string.charAt(string.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(xToY("xerxexx"));
    }
}
