package restproject.rest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ArrayResult {

    List<Integer> result;

    public ArrayResult(List<Integer> result){
        this.result = result;
    }
}
