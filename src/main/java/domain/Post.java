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
    return String.format("{%s}, {%s}", message, time);
  }
}
