import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return content.equals(post.content) &&
                timestamp.equals(post.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, timestamp);
    }
}
