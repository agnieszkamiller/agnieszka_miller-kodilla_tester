import junit.framework.TestCase;
import org.junit.Test;

public class ApplicationTestSuite {

    @Test
    public void shouldMainBeRun() {
        String[] args = null;
        Application.main(args);
    }

    @Test
    public void shouldAgeAndHeightValidating() {
        Application application = new Application("Ewa", 25, 1.75);
        application.ageAndHeightValidating();
    }
}