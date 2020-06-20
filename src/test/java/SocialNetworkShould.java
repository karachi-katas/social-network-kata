import domain.SocialNetwork;
import domain.SocialNetworkUser;
import org.junit.Test;

public class SocialNetworkShould {

    @Test
    public void haveUsers() {
        String userName=  "Alice";
        SocialNetworkUser user = new SocialNetworkUser(userName, new SocialNetwork());
    }


}
