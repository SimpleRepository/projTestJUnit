import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gudilin on 01.10.2020.
 */
public class TestCalculator {
    @Test
    public void tests() throws Exception {
        Calculator calc = new Calculator();
        int result = calc.add(3,5);
        Assert.assertEquals(9,result);
    }
}
