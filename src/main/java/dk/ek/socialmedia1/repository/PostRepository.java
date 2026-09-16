package dk.ek.socialmedia1.repository;

import dk.ek.socialmedia1.model.Post;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {

    public PostRepository(){
    }

    private final List<Post> posts = new ArrayList<>();

    public void createPost(Post post) {

        if (post == null) {
            throw new IllegalArgumentException(
                    "Tourist Attractions cannot be null"
            );
        }
        posts.add(post);
    }

    public List<Post> getAllPosts(){
        return posts;
    }

}
