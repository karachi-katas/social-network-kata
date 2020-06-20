import java.util.Date;

public class Post {
    private String content;
    private Date timestamp;

    public Post(String content, Date timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
