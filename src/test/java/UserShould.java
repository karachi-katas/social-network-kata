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
    }

    @Test
    public void beAbleToPublishAPost() {
        User user = new User("Alice");
        Post post = new Post("Post content", new Date(1592650942000L));
        user.publish(post);
        List<Post> userPosts = user.getPosts();
        Assert.assertEquals(post, userPosts.get(0));
    }
}


