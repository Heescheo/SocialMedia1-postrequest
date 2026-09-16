package dk.ek.socialmedia1.controller;

import dk.ek.socialmedia1.model.Post;
import dk.ek.socialmedia1.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/posts")
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository){

        this.postRepository = postRepository;
    }


    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("post", new Post());
        return "newPost";
    }


    @PostMapping
    public String createPost(@ModelAttribute Post post) {
        postRepository.createPost(post);
        return "redirect:/posts";
    }


    @GetMapping
    public String showAllPosts(Model model) {
        model.addAttribute("posts", postRepository.getAllPosts());
        return "postList";
    }
}
