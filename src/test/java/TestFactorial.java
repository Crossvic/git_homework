import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {

    @Test
    void testFactorial() {
        Assert.assertEquals(FindFactorial.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Вы ввели отрицательное число")
    public void testIllegalArgumentException() {
        FindFactorial.factorial(-1);
    }
}
