import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    public boolean post(User user, Message message) {
        user.addMessage(message);
        return true;

    }

    public void follow(User follower, User followee) {
        follower.subscribe(followee);
    }

    public ArrayList<Message> viewTime(User user) {
        return user.getTimeLine();
    }

    public ArrayList<Message> getWall(User user) {

        final List<User> subscriptions = user.getSubscriptions();

        ArrayList<Message> wall = new ArrayList<Message>();

        for (User subscription : subscriptions) {
            wall.addAll(subscription.getTimeLine());
        }

        wall.addAll(user.getTimeLine());

        return wall;
    }
}
