import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class UserShould {
    @Test
    public void beInstantiableWithParameters(){
        String actualName = "Alice" ;
        User user = new User (actualName) ;
        Assert.assertEquals(actualName , user.getName());
        Assert.assertEquals(0, user.getPosts().size());
        Assert.assertEquals(0, user.getFollowing().size());
    }

    @Test
    public void beAbleToPublishAPost() {
        User user = new User("Alice");
        Post post = new Post("Post content", new Date(1592650942000L));
        user.publish(post);
        List<Post> userPosts = user.getPosts();
        Assert.assertEquals(post, userPosts.get(0));
    }

    @Test
    public void beAbleToFollowOtherUsers() {
        User alice = new User("Alice");
        User bob   = new User("Bob");

        bob.follow(alice);

        List<User> following = bob.getFollowing();

        Assert.assertEquals(alice, following.get(0));
    }
}


