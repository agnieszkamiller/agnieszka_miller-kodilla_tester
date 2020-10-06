import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testAdd() {
//      given
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 0;

//        when
        double sumResult = calculator.add(a, b);

//        then
        Assertions.assertEquals(0, sumResult);
    }

    @Test
    public void testSub() {
//        given
        Calculator calculator = new Calculator();

//        when
        double subResult = calculator.sub(5.50, 5.00);

//        than
        assertEquals(0.50, subResult);
    }

    @Test
    public void testCircleArea() {
//        given
        Calculator calculator = new Calculator();
//    when
        String input1 = "Aga";
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in1);
//    than
        assertEquals(3.1415927, calculator.circleArea(1));
    }

    @Test
    public void testCirclePerimeter() {
//        given
        Calculator calculator = new Calculator();
//    when

//    than
        assertEquals(6.2831854, calculator.circlePerimeter(1));
    }

}