import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    List<String> usernames = new ArrayList<>();
    List<String> posts = new ArrayList<>();

    public void post(String username, String message) throws UsernameMustNotBeEmpty {

        if (username.equals("")) {
            throw new UsernameMustNotBeEmpty();
        }
        usernames.add(username);
        posts.add(message);
    }

    public boolean userExists(String username) {

        if(!usernames.contains(username)){
            return false;
        }

        return true;
    }

    public List<String> read(String username, String postOf) {
        return posts;
    }
}
