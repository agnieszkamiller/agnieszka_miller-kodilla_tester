import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GradesTestSuite  {
    @Test
    public void testAddCorrectly() {
    Grades grades = new Grades();
    grades.add(4);
    }
    @Test
    public void testLastValue() {
        Grades grades = new Grades();
        grades.add(4);
        grades.lastValue();
    }

    @Test
    public void testAverageValue() {
        Grades grades = new Grades();
        grades.add(4);
        grades.averageValue();
    }

}