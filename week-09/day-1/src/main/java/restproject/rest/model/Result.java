package restproject.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Result {
    Integer result;

    public Result(Integer result){
        this.result = result;
    }

}
