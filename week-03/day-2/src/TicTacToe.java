import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static String[][] fileToBoard(String src){
        String[][] board = new String[3][3];
        List<String> boardList = new ArrayList<>();
        try{
            Path filePath = Paths.get(src);
            boardList = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("There's something wrong with reading the file: ");
        }
        for (int i = 0; i < 3; i++){
            board[i] = boardList.get(i).split("");
        }
        return board;
    }

    public static String ticTacResult(String src){
        String[][] board = fileToBoard(src);
        String result = "draw";
        for (int i = 0; i < 3; i++){
            if (board[i][1].equals(board[i][2]) && board[i][2].equals(board[i][0])) {
                result = board[i][1];
            } else if (board[1][i].equals(board[2][i]) && board[2][i].equals(board[0][i])) {
                result = board[1][i];
            }

        }
        if (board[1][1].equals(board[2][2]) && board[2][2].equals(board[0][0])){
            result = board[1][1];
        } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
            result = board[1][1];
        }
        return result;

    }

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }
}