package models;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    User user = new User("Moses", 1, "Maintain servers");
    @Test
    public void userInatanciatesCorrectly() {

        assertEquals(true, user instanceof User);
    }
}
