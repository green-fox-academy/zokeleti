package restproject.rest.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entries {

    List<Log> entries;

    @JsonProperty(value = "entry_count")
    Integer entryCount;

    public Entries(List<Log> entries){
        this.entries = entries;
        this.entryCount = entries.size();
    }
}
