import org.junit.Assert;
import org.junit.Test;

public class FirstNumberTest {

    @Test
    public void testFirstNumberIsLargest() {
        float num1 = 5.5f;
        float num2 = 4.2f;
        float num3 = 3.7f;

        float largest = num1;

        Assert.assertTrue("First number is not the largest", largest >= num2);
        Assert.assertTrue("First number is not the largest", largest >= num3);
    }
}
