package char_sequence;

public class ShiftedCharSequence implements CharSequence{
    String shiftedString;
    int numberToShift;
    public ShiftedCharSequence(String string, int numberToShift){
        shiftedString = string;
        this.numberToShift = numberToShift;
    }

    @Override
    public int length() {
        return shiftedString.length();
    }

    @Override
    public char charAt(int index) {
        return shiftedString.charAt(index + numberToShift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return shiftedString.substring(start + numberToShift, end + numberToShift);
    }
}
