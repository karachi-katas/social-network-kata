import domain.SocialNetworkUser;

import java.util.ArrayList;
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
        SocialNetworkUser user = new SocialNetworkUser(userName);
        users.put(userName,user);

        return  user;

    }
}
