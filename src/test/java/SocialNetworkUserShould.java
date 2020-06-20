import static org.junit.Assert.assertEquals;

import domain.MockPost;
import domain.Post;
import domain.SocialNetworkUser;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SocialNetworkUserShould {

  SocialNetworkUser userBob, userAlice;
  @Test
  public void beAbleToPostOnTimeLine() {

    String message = "Today is Saturday";
    userBob.post(new Post(message));
  }

  @Test
  public void beAbleToViewTimeline() {

    String message = "Today is Saturday";
    Timestamp currentTime = new Timestamp(System.currentTimeMillis());
    userBob.post(new MockPost(message, currentTime, currentTime));
    List<Post> timeline = userBob.getTimeline();

    assert timeline.size() == 1;
    Post firstPost = timeline.get(0);
    assertEquals("Today is Saturday (0 minutes ago)", firstPost.toString());
  }
  @Test
  public  void beAbleToViewSomeOneElseTimeline()
  {
    SocialNetwork socialNetwork = new SocialNetwork();

    userAlice = socialNetwork.registerUser("Alice");
    userBob = socialNetwork.registerUser("Bob");


    //bob message
    String message = "Today is Saturday";
    Timestamp currentTime = new Timestamp(System.currentTimeMillis());
    userBob.post(new MockPost(message, currentTime, currentTime));
    List<Post> timeline = userBob.getTimeline();

    //allice message
    String message = "Today is Saturday";
    Timestamp currentTime = new Timestamp(System.currentTimeMillis());
    userAlice.post(new MockPost(message, currentTime, currentTime));
    List<Post> timeline = userAlice.getTimeline();




  }
  @Before
  public void setup()
  {
    String userName=  "Alice";
    userAlice = new SocialNetworkUser(userName);
    userName=  "Bob";
    userBob = new SocialNetworkUser(userName);
  }

}
