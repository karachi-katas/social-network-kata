public class SocialNetwork {

    public boolean post(User user,Message message){
    	user.addMessage(message);
    	return true;

    }
}
