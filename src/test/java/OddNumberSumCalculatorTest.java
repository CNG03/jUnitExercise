import org.example.OddNumberSumCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddNumberSumCalculatorTest {

    @Test
    public void testSumOfOddNumbersWithPositiveEvenInput() {
        int n = 10;

        int result = OddNumberSumCalculator.sumOfOddNumbers(n);

        assertEquals(25, result);
    }

    @Test
    public void testSumOfOddNumbersWithPositiveOddInput() {
        int n = 15;

        int result = OddNumberSumCalculator.sumOfOddNumbers(n);

        assertEquals(64, result);
    }

    @Test
    public void testSumOfOddNumbersWithZeroInput() {
        int n = 0;

        int result = OddNumberSumCalculator.sumOfOddNumbers(n);

        assertEquals(0, result);
    }

    @Test
    public void testSumOfOddNumbersWithOneInput() {
        int n = 1;

        int result = OddNumberSumCalculator.sumOfOddNumbers(n);

        assertEquals(1, result);
    }

    @Test
    public void testSumOfOddNumbersWithNegativeInput() {
        int n = -5;

        assertThrows(IllegalArgumentException.class, () -> {
            OddNumberSumCalculator.sumOfOddNumbers(n);
        });
    }

    @Test
    public void testSumOfOddNumbersWithLargeInput() {
        int n = Integer.MAX_VALUE;

        assertThrows(IllegalArgumentException.class, () -> {
            OddNumberSumCalculator.sumOfOddNumbers(n);
        });
    }

    @Test
    public void testSumOfOddNumbersWithSumExceedingIntegerMaxValue() {
        int n = 500000; // Chọn một giá trị lớn đủ để vượt quá giới hạn của kiểu int

        assertThrows(ArithmeticException.class, () -> {
            OddNumberSumCalculator.sumOfOddNumbers(n);
        });
    }
}
