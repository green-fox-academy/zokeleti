package reddit.reddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reddit.reddit.model.Post;
import reddit.reddit.repository.PaginatingRepository;
import reddit.reddit.repository.Repository;

import java.util.List;

@Service
public class PostService {

    public int currentpage = 0;
    Repository postRepository;
    PaginatingRepository paginatingRepository;

    @Autowired
    public PostService(Repository repository, PaginatingRepository paginatingRepository){
        this.postRepository=repository;
        this.paginatingRepository = paginatingRepository;
    }

    public void upVote(Long id){
        Post postToSave = postRepository.findById(id).get();
        postToSave.setVotes(postToSave.getVotes() + 1);
        postRepository.save(postToSave);
    }

    public void downVote(Long id){
        Post postToSave = postRepository.findById(id).get();
        postToSave.setVotes(postToSave.getVotes() - 1);
        postRepository.save(postToSave);
    }

    public List<Post> paginate(int pagenumber){
        Pageable pageable = PageRequest.of(pagenumber,3);
        List<Post> postList = paginatingRepository.findAll(pageable).getContent();
        return postList;
    }



}
