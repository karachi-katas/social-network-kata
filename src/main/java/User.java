import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<TimelineMessage> timeline;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.timeline = new ArrayList();
        this.subscriptions = new ArrayList();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<TimelineMessage> getTimeline() {
        return timeline;
    }

    public void setTimeline(List timeline) {
        this.timeline = timeline;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void postMessage(String message, String username) {
        this.timeline.add(new TimelineMessage(message,username));
    }

    public void addSubscription(User user) {
        this.subscriptions.add(user);
    }

    public String viewAggregatedList() {
        StringBuilder aggregatedMessage = new StringBuilder();
        for(User subbed: subscriptions) {
            for(TimelineMessage message: subbed.getTimeline()) {
                aggregatedMessage.append(message.toString()).append("\n");
            }
        }
        return aggregatedMessage.toString();
    }
}
