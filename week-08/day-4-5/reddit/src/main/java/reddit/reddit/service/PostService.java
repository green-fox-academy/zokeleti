package reddit.reddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reddit.reddit.model.Post;
import reddit.reddit.repository.Repository;

@Service
public class PostService {


    Repository postRepository;

    @Autowired
    public PostService(Repository repository){
        this.postRepository=repository;
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

}
