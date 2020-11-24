public class TakesLonger {

    // When saving this quote a disk error has occurred. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        int index = quote.indexOf("It") + 2;
        String newString = "";
        String toInsert = "always takes longer than ";

        for (int i = 0; i < quote.length(); i++){
            newString = newString + quote.charAt(i);
            if (i == index){
                newString = newString + toInsert;
            }
        }
        quote = newString;



        System.out.println(quote);
    }
}