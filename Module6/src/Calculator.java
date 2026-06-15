// Calculator.java — Module 6 Assignment 1
public class Calculator {

    /**
     * Calculates the average of an array of doubles.
     * Returns 0.0 if the array is null or empty.
     */
    public double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0)
            return 0.0;
        double sum = 0.0;
        for (double n : numbers)
            sum += n;
        return sum / numbers.length;
    }
}
