import junit.framework.TestCase;
import org.junit.Test;

public class RandomNum2TestSuite {

    @Test
    public void testMax(){
        RandomNum2 randomNum2 = new RandomNum2();
        randomNum2.podajMax(1);
    }

    @Test
    public void testMin(){
        RandomNum2 randomNum2 = new RandomNum2();
        randomNum2.podajMin(1);
    }

    @Test
    public void testMaxAndMin(){
        RandomNum2 randomNum2 = new RandomNum2();
        int min = 0;
        int max = 1;
        randomNum2.podajMinIMaxValue();
    }

    @Test
    public void shouldMainBeRun() {
        String[] args = null;
        RandomNum2.main(args);
    }
}