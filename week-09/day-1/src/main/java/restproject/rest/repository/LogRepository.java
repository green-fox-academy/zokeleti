package restproject.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import restproject.rest.model.Log;

@Repository
public interface LogRepository extends CrudRepository<Log, Integer> {

}
