package domain;

import java.sql.Timestamp;

public class Post {
  String message;
  Timestamp time;

  public Post(String message) {
    this.message = message;
    this.time = new Timestamp(System.currentTimeMillis());
  }

  public Timestamp getTime() {
    return time;
  }

  @Override
  public String toString() {
    long diff = System.currentTimeMillis() - time.getTime();
    return String.format("%s (%s minutes ago)", message, diff / (60 * 1000));
  }
}
