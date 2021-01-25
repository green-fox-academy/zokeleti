package restproject.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Error {
    String error;

    public Error(String error){
        this.error = error;
    }
}
