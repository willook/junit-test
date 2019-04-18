import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CustomCalculatorTest {

    @Test
    public void checkPlus(){
        CustomCalculator cal = new CustomCalculator();
        int result  = cal.add(3,4);
        assertTrue(result==7);
    }
    @Test
    public void checkMinus(){
        CustomCalculator cal = new CustomCalculator();
        int result  = cal.subtract(3,4);
        assertTrue(result==-1);
    }
    @Test
    public void checkMul(){
        CustomCalculator cal = new CustomCalculator();
        int result  = cal.multiply(3,4);
        assertTrue(result==12);
    }
    @Test
    public void checkDiv(){
        CustomCalculator cal = new CustomCalculator();
        int result  = cal.divide(3,4);
        assertTrue(result==0);
    }
}
