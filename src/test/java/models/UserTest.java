package models;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    User user = new User("Moses", 1, "Maintain servers");
    @Test
    public void userInatanciatesCorrectly() {

        assertEquals(true, user instanceof User);
    }

    @Test
    public void getUserName() {
        assertEquals("Moses", user.getName());
    }
    @Test
    public void getsUserDepartmentId() {
        assertEquals(1, user.getDepartmentId());
    }
    @Test
    public void getsUserRole() {
        assertEquals("Maintain servers", user.getRole());
    }
}
