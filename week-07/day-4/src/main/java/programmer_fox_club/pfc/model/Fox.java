package programmer_fox_club.pfc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fox {

    private String name;
    List<String> listOfTricks;
    String food;
    String drink;

    public Fox(String name){
        this.name = name;
        this.food = "pizza";
        this.drink = "beer";
        this.listOfTricks = new ArrayList<>();
    }

}


    /*create a Fox.class
it should represent a virtual fox
                it should have at least the followings: name, list of tricks, food and drink
        consider using more classes or enums
        add a new Fox (created with the received name) to a list of Foxes. Set any initial values for food and drink too.
        find the actual fox based on the name and send it to the template model
        use Thymeleaf to replace the data
        if the fox does not know any tricks yet, display a message instead of an empty list
        if the fox's name is Mr. Green, eats salad, drinks water and knows 0 tricks, the updated information view should represent that
*/