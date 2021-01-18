package todospringsqlexercise.todo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {

    public Todo(String title){
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String title;
    boolean urgent = false;
    boolean done = false;
}
