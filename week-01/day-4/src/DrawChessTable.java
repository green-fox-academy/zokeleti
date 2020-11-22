public class DrawChessTable {
    // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
    public static void main(String[] args) {
        String field = "%";
        for (int i = 0; i < 8; i ++){
            for (int j = 0; j < 8; j++){
                System.out.print(field);
                if (field.equals("%")){
                    field = " ";
                } else {
                    field = "%";
                }
            }
            if (field.equals("%")){
                field = " ";
            } else {
                field = "%";
            }
            System.out.println();
        }
    }
}
