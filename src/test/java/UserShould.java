import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class UserShould {
    @Test
    public void beInstantiableWithParameters(){
        String actualName = "Alice" ;
        User user = new User (actualName) ;
        Assert.assertEquals(actualName , user.getName());
    }
}


