import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object cleaned up");
    }

    @Test
    public void testAddition() {

        int a = 5;
        int b = 3;// Act
        int result = calculator.add(a, b);


        assertEquals(8, result);
    }

    @Test
    public void testMultiplication() {// Arrange
        int a = 4;
        int b = 2;

        int result = calculator.multiply(a, b);
        assertEquals(8, result);
    }
}
