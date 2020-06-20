import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SocialMediaShould {


    @Test
    public void hasUsers() {
        SocialMedia socialMedia = new SocialMedia();
        String username = "Alice";
        String username2 = "Bob";
        String username3 = "Charlie";
        User alice = new User(username);
        User bob = new User(username2);
        User charlie = new User(username3);
        socialMedia.addUser(alice);
        socialMedia.addUser(bob);
        socialMedia.addUser(charlie);
        assertTrue(socialMedia.getUsers().size() ==3);
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