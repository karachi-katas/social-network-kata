import java.util.ArrayList;
import java.util.List;

public class SocialMedia {
    private List<User> users;
    public SocialMedia() {this.users = new ArrayList();}
    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return this.users;
    }
}
