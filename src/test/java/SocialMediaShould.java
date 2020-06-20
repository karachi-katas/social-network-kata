import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SocialMediaShould {

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
        user.postMessage(message, username);
        assertTrue(user.getTimeline().size() > 0);
    }

    @Test
    public void isFollowing() {
        String username = "Alice";
        String username2 = "Bob";
        User user = new User(username);
        User user2 = new User(username2);
        user.addSubscription(user2);
        assertTrue(user.getSubscriptions().size() > 0);
    }

    @Test
    public void readTimeline() {
        String username = "Alice";
        String username2 = "Bob";
        User user = new User(username);
        User user2 = new User(username2);
        user.addSubscription(user2);
        user2.postMessage("message1", user2.getUsername());
        for(User subbedUser: user.getSubscriptions()) {
            if(subbedUser.getUsername().equals(username2)) {
                /*for(TimelineMessage messages: subbedUser.getTimeline()) {
                    asser
                }*/
                assertTrue(subbedUser.getTimeline().size() > 0);
            }
        }
    }

    @Test
    public void viewAggregatedListFromSubscriptions() {
        String username = "Alice";
        String username2 = "Bob";
        String username3 = "Charlie";
        User alice = new User(username);
        User bob = new User(username2);
        User charlie = new User(username3);
        alice.addSubscription(bob);
        alice.addSubscription(charlie);
        bob.postMessage("message1", bob.getUsername());
        bob.postMessage("message2", bob.getUsername());
        charlie.postMessage("message3", charlie.getUsername());
        assertTrue(!alice.viewAggregatedList().equals(""));
    }

}