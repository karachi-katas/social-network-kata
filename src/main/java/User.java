import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<User> subscriptions = new ArrayList<User>();
    private ArrayList<Message> timeLine = new ArrayList<Message>();

    User(String username) {
        this.username = username;
    }

    public ArrayList<Message> getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(ArrayList<Message> timeLine) {
        this.timeLine = timeLine;
    }

    public void addMessage(Message message) {
        this.timeLine.add(message);
    }

    public ArrayList<User> getSubscriptions() {
        return this.subscriptions;
    }

    public void subscribe(User followee) {
        this.subscriptions.add(followee);
    }
}


