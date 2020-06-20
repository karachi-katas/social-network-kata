import org.junit.Test;

public class SocialNetworkShould {



    @Test
    public void createUserOnFirstPost() {

        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.post("Alice","What a wonderfully sunny day");
        assert socialNetwork.userExists("Alice");

    }
}
