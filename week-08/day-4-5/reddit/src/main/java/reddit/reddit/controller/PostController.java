package reddit.reddit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import reddit.reddit.model.Post;
import reddit.reddit.repository.Repository;
import reddit.reddit.service.PostService;

@Controller
public class PostController {

    reddit.reddit.repository.Repository postRepository;
    PostService service;

    @Autowired
    public PostController(Repository repository, PostService service){
        this.postRepository = repository;
        this.service = service;
    }

    @GetMapping("/")
    public String postIndex(Model model){
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String getCreatePost(){
        return "create";
    }

    @PostMapping("/create")
    public String postCreatePost(@ModelAttribute Post post){
        postRepository.save(post);
        return "redirect:/";
    }

    @GetMapping("/upvote/{id}")
    public String upVote(@PathVariable Long id){
        service.upVote(id);
        return "redirect:/";
    }

    @GetMapping("/downvote/{id}")
    public String downVote(@PathVariable Long id){
        service.downVote(id);
        return "redirect:/";
    }
}
