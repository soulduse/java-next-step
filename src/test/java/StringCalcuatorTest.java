import com.book.soulduse.StringCalcuator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 3.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class StringCalcuatorTest {

    private StringCalcuator calcuator;

    @Before
    public void setup(){
        calcuator = new StringCalcuator();
    }

    @Test
    public void splitAndHap(){
//        assertEquals(3, calcuator.splitAndHap("1,2"));
//        assertEquals(6, calcuator.splitAndHap("1,2,3"));
//        assertEquals(6, calcuator.splitAndHap("1,2:3"));
//        assertEquals(0, calcuator.splitAndHap(" "));
        assertEquals(0, calcuator.splitAndHap(" "));
        assertEquals(6, calcuator.splitAndHap("//;\n1;2;3"));

    }

    @Test(expected = RuntimeException.class)
    public void checkException(){
        calcuator.splitAndHap("1:2:-3");
    }

    @Test
    public void customSplit(){
        assertEquals(";", calcuator.customSplit("//;\n"));
    }
}
