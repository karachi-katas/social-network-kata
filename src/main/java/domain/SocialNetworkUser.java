package domain;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkUser {
  private String userName;
  private List<Post> timeline;

  private SocialNetwork socialNetwork;

  public SocialNetworkUser(String userName, SocialNetwork socialNetwork) {
    this.userName = userName;
    this.timeline = new ArrayList<>();
    this.socialNetwork = socialNetwork;
  }

  public void post(Post post) {
    this.timeline.add(post);
  }

  public List<Post> getTimeline() {
    return timeline;
  }

  public List<Post> getTimeline(String userName) {
    return socialNetwork.getTimeline(userName);
  }

}
