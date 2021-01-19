package connetctionwithmysql.exercise.repository;

import org.springframework.data.repository.CrudRepository;
import connetctionwithmysql.exercise.model.Todo;

public interface Repository extends CrudRepository<Todo, Long> {

}
