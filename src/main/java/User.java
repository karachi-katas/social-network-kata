import java.util.ArrayList;

public class User {

	private String username;

	User(String username){
		this.username = username;
	}

	private ArrayList<Message> timeLine = new ArrayList<Message>();

	public ArrayList<Message> getTimeLine() {
		return timeLine;
	}

	public void setTimeLine(ArrayList<Message> timeLine) {
		this.timeLine = timeLine;
	}
	
	public void addMessage(Message message) {
		this.timeLine.add(message);
	}
	
}


