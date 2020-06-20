package domain;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkUser {
  private String userName;
  private List<Post> timeline;

  public SocialNetworkUser(String userName) {
    this.userName = userName;
    this.timeline = new ArrayList<>();
  }

  public void post(Post post) {
    this.timeline.add(post);
  }

  public List<Post> getTimeline() {
    return timeline;
  }
}
