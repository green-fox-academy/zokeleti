import java.util.ArrayList;
import java.util.List;

public class Sum{
    public Integer sum(List<Integer> numbersToAdd) throws Exception {
        if (numbersToAdd == null){
            throw new IllegalArgumentException("illegal argument");
        }
        Integer result = 0;
        for(Integer num : numbersToAdd){
            result += num;
        }
        return result;
    }
}
