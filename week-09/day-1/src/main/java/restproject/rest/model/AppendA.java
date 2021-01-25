package restproject.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AppendA {

    String appended;

    public AppendA(String toAppend){
        this.appended = toAppend + "a";
    }
}
