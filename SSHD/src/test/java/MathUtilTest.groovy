import org.junit.Test;
import static org.junit.Assert.*;
public class MathUtilTest {
    @Test
    public void testAdd() throws Exception {
        double sum=MathUtil.add(1.0,5.0);
        assertEquals(6,sum,0.1);
    }
}