package reddit.reddit.repository;

import org.springframework.data.repository.CrudRepository;
import reddit.reddit.model.User;

public interface UserRepository  extends CrudRepository<User, Long> {
}
