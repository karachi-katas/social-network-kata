package domain;

import domain.Post;
import domain.SocialNetworkUser;

import exceptions.UserDoesNotExistException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialNetwork {

    Map<String,SocialNetworkUser> users;

    public SocialNetwork()
    {
        users = new HashMap<>();
    }

    public SocialNetworkUser registerUser(String userName)
    {
        SocialNetworkUser user = new SocialNetworkUser(userName, this);
        users.put(userName,user);
        return  user;
    }


    public List<Post> getTimeline(String user) throws UserDoesNotExistException {
        if (!users.containsKey(user)) {
            throw new UserDoesNotExistException();
        }
        return users.get(user).getTimeline();
    }
}
