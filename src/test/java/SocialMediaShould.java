import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SocialMediaShould {

    @Test
    public void doSomething() {
        assert true;
    }

    @Test
    public void hasAUser() {
        String username = "Alice";
        User user = new User(username);
        assertTrue(!user.equals(null));
    }

    @Test
    public void hasAUsername() {
        String username = "Alice";
        User user = new User(username);
        assertTrue(user.getUsername().equals(username));
    }

    @Test
    public void hasATimeline() {
//        String message = "message1";
        String username = "Alice";
        User user = new User(username);
        assertTrue(!user.getTimeline().equals(null));
    }

    @Test
    public void messageAddedToTimeline() {
        String message = "message1";
        String username = "Alice";
        User user = new User(username);
        user.postMessage(message);
        assertTrue(user.getTimeline().size()>0);
    }

    @Test
    public void isFollowing() {
        String username = "Alice";
        String username2 = "Bob";
        User user = new User(username);
        User user2 = new User(username2);
        user.addSubscription(user2);
        assertTrue(user.getSubscriptions().size()>0);
    }
}
