package char_sequence;

public class Gnirts implements CharSequence{
    String string;
    public String reverse(String string){
        StringBuilder result = new StringBuilder();
        result.append(string);
        result = result.reverse();
        return String.valueOf(result);
    }
    public Gnirts(String string){
        this.string = reverse(string);
    }


    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.substring(start, end);
    }
}
