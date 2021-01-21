package reddit.reddit.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import reddit.reddit.model.Post;

public interface Repository extends CrudRepository<Post, Long> {
}
