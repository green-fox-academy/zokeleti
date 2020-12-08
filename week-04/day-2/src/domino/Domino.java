package domino;

public class Domino implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino domino) {
        if (left < domino.left){
            return -1;
        } else if (left > domino.left){
            return 1;
        } else if (left == domino.left){
            if (right < domino.right){
                return -1;
            } else if(right > domino.right){
                return 1;
            }
        }
        return 0;
    }

}