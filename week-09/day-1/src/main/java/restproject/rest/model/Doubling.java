package restproject.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doubling {
    Long received;
    Long result;

    public Doubling(Long received){
        this.received = received;
        this.result = received * 2;
    }
}
