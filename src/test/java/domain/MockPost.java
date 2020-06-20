package domain;

import java.sql.Timestamp;

public class MockPost extends Post {

    private Timestamp currentTime;

    public MockPost(String message, Timestamp time, Timestamp currentTime) {
        super(message);
        this.time = time;
        this.currentTime = currentTime;
    }

    @Override
    public String toString() {
        long diff = currentTime.getTime() - time.getTime();
        return String.format("%s (%s minutes ago)", message, diff / (60 * 1000));
    }
}
