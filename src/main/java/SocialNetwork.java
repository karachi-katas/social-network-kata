import java.util.ArrayList;

public class SocialNetwork {

    public boolean post(User user,Message message){
    	user.addMessage(message);
    	return true;

    }

    public ArrayList<Message> viewTime(User user) {
        return user.getTimeLine();
    }
}
