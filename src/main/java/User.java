import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Post> posts;

    public User(String name) {
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void publish(Post post) {
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}
