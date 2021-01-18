package todospringsqlexercise.todo.repository;

import org.springframework.data.repository.CrudRepository;
import todospringsqlexercise.todo.model.Todo;

public interface Repository extends CrudRepository<Todo, Long> {

}
