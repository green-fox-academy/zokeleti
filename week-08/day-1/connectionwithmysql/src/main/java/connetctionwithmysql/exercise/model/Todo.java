package connetctionwithmysql.exercise.model;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class Todo {

    public Todo(String title){
        this.title = title;
    }
    /*public Todo(String title, boolean urgent, boolean done){
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String title;
    boolean urgent = false;
    boolean done = false;
}
