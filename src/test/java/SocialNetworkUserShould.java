import static org.junit.Assert.assertEquals;

import domain.MockPost;
import domain.Post;
import domain.SocialNetwork;
import domain.SocialNetworkUser;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SocialNetworkUserShould {

  SocialNetwork socialNetwork;
  SocialNetworkUser userBob, userAlice;

  @Before
  public void setup()
  {
    this.socialNetwork = new SocialNetwork();
    userAlice = socialNetwork.registerUser("Alice");
    userBob = socialNetwork.registerUser("Bob");

    initUser("Today is Saturday", userBob);
    initUser("Today is Sunny", userAlice);
  }

  @Test
  public void beAbleToPostOnTimeLine() {

    String message = "Today is Saturday";
    userBob.post(new Post(message));
  }

  @Test
  public void beAbleToViewTimeline() {
    List<Post> timeline = userBob.getTimeline();

    assert timeline.size() == 1;
    Post firstPost = timeline.get(0);
    assertEquals("Today is Saturday (0 minutes ago)", firstPost.toString());
  }
  @Test
  public  void beAbleToViewSomeOneElseTimeline()
  {
    List<Post> timeline = userAlice.getTimeline("Bob");
    Post firstPost = timeline.get(0);
    assertEquals("Today is Saturday (0 minutes ago)", firstPost.toString());

  }

  private void initUser(String message, SocialNetworkUser user) {
    Timestamp currentTime = new Timestamp(System.currentTimeMillis());
    user.post(new MockPost(message, currentTime, currentTime));
  }



}
