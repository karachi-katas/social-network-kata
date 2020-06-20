import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialNetwork {

    List<String> usernames = new ArrayList<>();

    Map<String, List<String>> postsByUser = new HashMap<>();

    public void post(String username, String message) throws UsernameMustNotBeEmpty {

        if (username.equals("")) {
            throw new UsernameMustNotBeEmpty();
        }
        usernames.add(username);

        if (!postsByUser.containsKey(username)) {
            postsByUser.put(username, new ArrayList<>());
        }

        postsByUser.get(username).add(message);
    }

    public boolean userExists(String username) {

        if(!usernames.contains(username)){
            return false;
        }

        return true;
    }

    public List<String> read(String username, String postOf) {
        return postsByUser.get(postOf);
    }
}
