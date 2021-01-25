package reddit.reddit.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import reddit.reddit.model.Post;

public interface PaginatingRepository extends PagingAndSortingRepository<Post, Long> {

}
