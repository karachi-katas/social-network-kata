import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SocialNetworkShould {

    @Test
    public void postTest() {
        User user = new User();
        Message message = new Message("Hello");
        SocialNetwork socialNetwork = new SocialNetwork();
        
        socialNetwork.post(user,message);
        assertTrue(user.getTimeLine().contains(message));
    }


}
