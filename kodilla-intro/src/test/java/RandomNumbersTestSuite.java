import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbersTestSuite{

    @Test
    public void testDrawingNumbers(){
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.drawingNumbers();
    }
    @Test
    public void testMaxNumbers(){
        RandomNumbers randomNumbers = new RandomNumbers();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(55);

        Assertions.assertEquals(55, randomNumbers.maxElement(integerList));
    }

    @Test
    public void testMinNumbers(){
        RandomNumbers randomNumbers = new RandomNumbers();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(55);

        Assertions.assertEquals(5, randomNumbers.minElement(integerList));
    }

    @Test
    public void shouldMainBeRun() {
        String[] args = null;
        RandomNumbers.main(args);
    }
}