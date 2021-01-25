package restproject.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Welcome {

    String welcome_message;

    public Welcome(String name, String title){
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}