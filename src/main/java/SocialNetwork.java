public class SocialNetwork {


    public void post(String username, String message) throws UsernameMustNotBeEmpty {
        if (username.equals("")) {
            throw new UsernameMustNotBeEmpty();
        }
    }

    public boolean userExists(String username) {
        return true;
    }

    public boolean userExists(String alice) {
        return true;
    }
}
