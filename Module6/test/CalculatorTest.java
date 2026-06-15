// CalculatorTest.java — Module 6 Assignment 1: JUnit 5 Tests
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Test 1: Basic average of positive integers
    @Test
    public void testAverageOfPositiveNumbers() {
        double[] numbers = {10.0, 20.0, 30.0};
        assertEquals(20.0, calculator.calculateAverage(numbers), 0.001);
    }

    // Test 2: Single element — average equals the element itself
    @Test
    public void testAverageOfSingleElement() {
        double[] numbers = {42.0};
        assertEquals(42.0, calculator.calculateAverage(numbers), 0.001);
    }

    // Test 3: Decimal values
    @Test
    public void testAverageWithDecimals() {
        double[] numbers = {1.5, 2.5, 3.0};
        assertEquals(2.333, calculator.calculateAverage(numbers), 0.001);
    }

    // Test 4: Mix of negative and positive numbers
    @Test
    public void testAverageWithNegativeNumbers() {
        double[] numbers = {-10.0, 0.0, 10.0};
        assertEquals(0.0, calculator.calculateAverage(numbers), 0.001);
    }

    // Test 5: Empty array should return 0.0
    @Test
    public void testEmptyArrayReturnsZero() {
        double[] numbers = {};
        assertEquals(0.0, calculator.calculateAverage(numbers), 0.001);
    }

    // Test 6: Null input should return 0.0
    @Test
    public void testNullReturnsZero() {
        assertEquals(0.0, calculator.calculateAverage(null), 0.001);
    }

    // Test 7: Large dataset — average of 1 to 100
    @Test
    public void testLargeDataset() {
        double[] numbers = new double[100];
        for (int i = 0; i < 100; i++)
            numbers[i] = i + 1;
        assertEquals(50.5, calculator.calculateAverage(numbers), 0.001);
    }

    // Test 8: All same values
    @Test
    public void testAllSameValues() {
        double[] numbers = {5.0, 5.0, 5.0, 5.0};
        assertEquals(5.0, calculator.calculateAverage(numbers), 0.001);
    }
}
