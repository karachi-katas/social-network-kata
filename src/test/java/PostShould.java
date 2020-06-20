import org.junit.Assert;
import org.junit.Test;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;

public class PostShould {
    @Test
    public void beInstantiableWithParameters(){
        String actualContent = "Sample Post";
        Date actualTime = new Date(1592650942000L);
        Post post = new Post(actualContent, actualTime);
        Assert.assertEquals(actualContent, post.getContent());
        Assert.assertEquals(actualTime, post.getTimestamp());
    }
}
