import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class AdvCalculatorTestSuite {

    @Test
    public void shouldCalculate() {
        AdvCalculator advCalculator = new AdvCalculator();
        advCalculator.calculate();
    }
}