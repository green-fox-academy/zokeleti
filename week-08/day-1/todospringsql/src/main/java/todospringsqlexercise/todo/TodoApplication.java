package todospringsqlexercise.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import todospringsqlexercise.todo.model.Todo;
import todospringsqlexercise.todo.repository.Repository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    Repository todoRepository;
    public TodoApplication(Repository repository){
        this.todoRepository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("I have to learn everything"));
        todoRepository.save(new Todo("I have to practice everything"));*/
    }
}
