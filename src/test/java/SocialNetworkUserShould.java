import static org.junit.Assert.assertEquals;

import domain.MockPost;
import domain.Post;
import domain.SocialNetworkUser;
import java.sql.Timestamp;
import java.util.List;
import org.junit.Test;

public class SocialNetworkUserShould {

  @Test
  public void beAbleToPostOnTimeLine() {
    String userName=  "Alice";
    SocialNetworkUser user = new SocialNetworkUser(userName);

    String message = "Today is Saturday";
    user.post(new Post(message));
  }

  @Test
  public void beAbleToViewTimeline() {
    String userName = "Alice";
    SocialNetworkUser user = new SocialNetworkUser(userName);

    String message = "Today is Saturday";
    Timestamp currentTime = new Timestamp(System.currentTimeMillis());
    user.post(new MockPost(message, currentTime, currentTime));
    List<Post> timeline = user.getTimeline();

    assert timeline.size() == 1;
    Post firstPost = timeline.get(0);
    assertEquals("Today is Saturday (0 minutes ago)", firstPost.toString());
  }

}
