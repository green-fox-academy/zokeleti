package reddit.reddit.repository;

import org.springframework.data.repository.CrudRepository;
import reddit.reddit.model.Post;

public interface Repository extends CrudRepository<Post, Long> {
}
