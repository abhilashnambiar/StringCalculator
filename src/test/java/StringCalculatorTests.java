import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTests {

    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void testEmptyString() {
        int result = stringCalculator.Add("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testOneNumber() {
        int result = stringCalculator.Add("9");
        Assertions.assertEquals(9, result);
    }

    @Test
    public void testTwoNumbers() {
        int result = stringCalculator.Add("9,7");
        Assertions.assertEquals(16, result);
    }

    @Test
    public void testNNumbers() {
        int result = stringCalculator.Add("1,2,3,4,5,6,7,8");
        Assertions.assertEquals(36, result);
    }
}
