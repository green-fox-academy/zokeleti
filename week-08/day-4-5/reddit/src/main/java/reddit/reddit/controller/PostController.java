package reddit.reddit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import reddit.reddit.model.Post;
import reddit.reddit.repository.Repository;
import reddit.reddit.service.PostService;
import reddit.reddit.service.UserService;

@Controller
public class PostController {
    @Autowired
    reddit.reddit.repository.Repository postRepository;
    @Autowired
    PostService postService;
    @Autowired
    UserService userService;

    @Autowired
    public PostController(Repository repository, PostService postService, UserService userService){
        this.postRepository = repository;
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String getPostIndex(Model model){
        model.addAttribute("userName", );
        model.addAttribute("currentPage", 1);
        model.addAttribute("totalPosts", postService.getTotalElements());
        model.addAttribute("totalPages", postService.getTotalPages());
        System.out.println("normal postindex called");
        model.addAttribute("posts", postService.paginate(2));
        return "index";
    }

    @GetMapping("/{pageNumber}")
    public String getPostIndexByPage(Model model, @PathVariable(required = false) Integer pageNumber){
        Integer usedPageNumber;
        if(pageNumber ==null){
            usedPageNumber = 1;
        } else {
            usedPageNumber = pageNumber;
        }
        model.addAttribute("currentPage", usedPageNumber);
        System.out.println("requested pagenumber: " + usedPageNumber);
        model.addAttribute("posts", postService.paginate(usedPageNumber));
        model.addAttribute("totalPosts", postService.getTotalElements());
        model.addAttribute("totalPages", postService.getTotalPages());
        return "index";
    }

    @GetMapping("/create")
    public String getCreatePost(@RequestParam(required = false) String userName){
        if(userName != null) {
            return "create/" + userName;
        }
        return "login";
    }

    @PostMapping("/create")
    public String postCreatePost(@ModelAttribute Post post, @RequestParam String userName){
        postRepository.save(post);
        return "redirect:/";
    }

    @GetMapping("/upvote/{id}")
    public String upVote(@PathVariable Long id){
        postService.upVote(id);
        return "redirect:/";
    }

    @GetMapping("/downvote/{id}")
    public String downVote(@PathVariable Long id){
        postService.downVote(id);
        return "redirect:/";
    }

    /*@GetMapping("/nextpage")
    public String nextPage(){
        return null;
    }*/
}
