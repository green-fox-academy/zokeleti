import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        String[] resultArray = new String[s.length()/2 + s.length()%2];
        for (int i = 0,  j = 2, k = 0; i < s.length()  ; k +=1, i+=2, j+=2){
            try{
                resultArray[k] = s.substring(i,j);
            }
            catch(Exception e){
               resultArray[k] = s.substring(i) + "_";
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("HelloWorldHelloWorld")));
    }
}