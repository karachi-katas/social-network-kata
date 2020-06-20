import java.util.List;
import org.junit.Test;

public class SocialNetworkShould {

    @Test
    public void createUserOnFirstPost() throws UsernameMustNotBeEmpty {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.post("Alice","What a wonderfully sunny day");
        assert socialNetwork.userExists("Alice");
    }

    @Test(expected = UsernameMustNotBeEmpty.class)
    public void throwErrorIfUsernameIsEmpty() throws UsernameMustNotBeEmpty {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.post("","What a wonderfully sunny day");
    }

    @Test
    public void notHaveBobCreatedBecauseHeHasNotPosted() throws UsernameMustNotBeEmpty {
        SocialNetwork socialNetwork = new SocialNetwork();
        assert socialNetwork.userExists("Bob")==false;
    }

    @Test
    public void notHaveCharlieCreatedBecauseHeHasNotPosted() throws UsernameMustNotBeEmpty {
        SocialNetwork socialNetwork = new SocialNetwork();
        assert socialNetwork.userExists("Charlie")==false;
    }

    @Test
    public void readPostsOfAlice() throws UsernameMustNotBeEmpty {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.post("Alice","What a wonderfully sunny day");
        List<String> posts = socialNetwork.read("Alice", "Alice");
        assert posts.size() == 1;
        assert posts.get(0) == "What a wonderfully sunny day";
    }

    @Test
    public void readAnotherPostFromAlice() throws UsernameMustNotBeEmpty {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.post("Alice","Hello");
        List<String> posts = socialNetwork.read("Alice", "Alice");
        assert posts.size() == 1;
        assert posts.get(0) == "Hello";
    }

    @Test
    public void readOnlyAlicesPostsWhenAskedForAlicesPosts() throws UsernameMustNotBeEmpty {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.post("Alice","Post from Alice");
        socialNetwork.post("Bob","Post from Bob");
        List<String> posts = socialNetwork.read("Alice", "Alice");
        assert posts.size() == 1;
        assert posts.get(0) == "Post from Alice";
    }
}

