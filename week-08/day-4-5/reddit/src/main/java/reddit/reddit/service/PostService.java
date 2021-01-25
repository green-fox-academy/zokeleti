package reddit.reddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reddit.reddit.model.Post;
import reddit.reddit.repository.PaginatingRepository;
import reddit.reddit.repository.Repository;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class PostService {

    Repository postRepo;
    PaginatingRepository pageRepo;

    @Autowired
    public PostService(Repository repository, PaginatingRepository pageRepo){
        this.postRepo = repository;
        this.pageRepo = pageRepo;
    }

    public void upVote(Long id){
        Post postToSave = postRepo.findById(id).get();
        postToSave.setVotes(postToSave.getVotes() + 1);
        postRepo.save(postToSave);
    }

    public void downVote(Long id){
        Post postToSave = postRepo.findById(id).get();
        postToSave.setVotes(postToSave.getVotes() - 1);
        postRepo.save(postToSave);
    }

    public List<Post> paginate(Integer pagenumber){
        System.out.println("pagenumber: " + pagenumber);
        Pageable pageable = PageRequest.of(pagenumber - 1,10);
        List<Post> postList = pageRepo.findAll(pageable).getContent();
        return postList;
    }

    public Integer getTotalPages(){
        Pageable pageable = PageRequest.of(0, 10);
        return pageRepo.findAll(pageable).getTotalPages();
    }

    public Integer getTotalElements(){
        Pageable pageable = PageRequest.of(0, 10);
        return (int) pageRepo.findAll(pageable).getTotalElements();
    }



}
