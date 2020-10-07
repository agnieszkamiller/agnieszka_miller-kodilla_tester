import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserTestSuite extends TestCase {

    @Test
    public void testTestGetName() {
        User user = new User("Ala", 15);
        Assertions.assertEquals("Ala", user.getName());
    }

    @Test
    public void testGetAge() {
        User user = new User("Ala", 15);
        Assertions.assertEquals(15, user.getAge());

    }

    @Test
    public void testMakeAString() {
        User user = new User("Ala", 15);
        Assertions.assertEquals("Name: Ala, age: 15", user.makeAString());

    }
}