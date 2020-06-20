import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import javafx.animation.Timeline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SocialNetworkShould {

    SocialNetwork socialNetwork;


    @Before
    public void setup(){
        socialNetwork = new SocialNetwork();
    }


    @Test
    public void postTest() {

        User user = new User("Alice");
        Message message = new Message("Hello");
        socialNetwork.post(user,message);
        assertTrue(user.getTimeLine().contains(message));
    }

    @Test
    public void allowViewTimeline(){

        User user = new User("Alice");
        setMockTimelineForUser(user);

        ArrayList<Message> timeline = socialNetwork.viewTime(user);
        Assert.assertEquals(timeline.size(), user.getTimeLine().size());

    }

    @Test(expected = AssertionError.class)
    public void allowViewTimeline_ShouldFail(){

        User user = new User("Alice");
        setMockTimelineForUser(user);

        ArrayList<Message> timeline = socialNetwork.viewTime(user);
        Assert.assertEquals(timeline.size(), 2);

    }


    private void setMockTimelineForUser(User user){

        user.addMessage(new Message("Hi this is message 1."));
        user.addMessage(new Message("Hi this is message 2."));
        user.addMessage(new Message("Hi this is message 3."));
    }



}
