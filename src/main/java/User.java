import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private List<Post> posts;
    private List<User> following;

    public User(String name) {
        this.name = name;
        this.posts = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void publish(Post post) {
        this.posts.add(post);
    }

    public void follow(User user) {
        this.following.add(user);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<User> getFollowing() {
        return following;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(posts, user.posts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, posts);
    }


}
