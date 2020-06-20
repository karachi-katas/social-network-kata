import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SocialNetworkShould {

    SocialNetwork socialNetwork;

    @Before
    public void setup() {
        socialNetwork = new SocialNetwork();
    }


    @Test
    public void postTest() {
        User user = new User("Alice");
        Message message = new Message("Hello");
        socialNetwork.post(user, message);
        assertTrue(user.getTimeLine().contains(message));
    }

    @Test
    public void allowViewTimeline() {
        User user = new User("Alice");
        setMockTimelineForUser(user);

        ArrayList<Message> timeline = socialNetwork.viewTime(user);
        Assert.assertEquals(timeline.size(), user.getTimeLine().size());

    }

    @Test(expected = AssertionError.class)
    public void allowViewTimeline_ShouldFail() {
        User user = new User("Alice");
        setMockTimelineForUser(user);

        ArrayList<Message> timeline = socialNetwork.viewTime(user);
        Assert.assertEquals(timeline.size(), 2);

    }

    @Test
    public void userCanFollow() {
        User follower = new User("Alice");
        User followee = new User("Bov");
        socialNetwork.follow(follower, followee);
        assertTrue(follower.getSubscriptions().contains(followee));
    }

    @Test
    public void showUserWall() {
        User subscriber1 = new User("sub1");
        subscriber1.addMessage(new Message("msg from sub1"));
        subscriber1.addMessage(new Message("msg2 from sub1"));

        User subscriber2 = new User("sub2");
        subscriber2.addMessage(new Message("msg1 from sub2"));
        subscriber2.addMessage(new Message("msg2 from sub2"));

        User user = new User("Alice");
        user.addMessage(new Message("msg From alice"));

        user.subscribe(subscriber1);
        user.subscribe(subscriber2);

        ArrayList<Message> wall = socialNetwork.getWall(user);

        assertEquals(5, wall.size());

    }


    private void setMockTimelineForUser(User user) {
        user.addMessage(new Message("Hi this is message 1."));
        user.addMessage(new Message("Hi this is message 2."));
        user.addMessage(new Message("Hi this is message 3."));
    }

}
