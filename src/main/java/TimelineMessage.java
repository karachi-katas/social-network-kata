import java.util.Date;

public class TimelineMessage {
    private String message;
    private String username;
    private Date timeOfPosting;

    public TimelineMessage(String message, String username) {
        this.message = message;
        this.username = username;
        this.timeOfPosting = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTimeOfPosting() {
        return timeOfPosting;
    }

    public void setTimeOfPosting(Date timeOfPosting) {
        this.timeOfPosting = timeOfPosting;
    }

    @Override
    public String toString() {
        return username + " -> " + message + " ( "+ timeOfPosting +")";
    }
}
