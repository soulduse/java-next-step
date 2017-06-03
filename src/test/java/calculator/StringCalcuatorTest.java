package calculator;

import com.book.soulduse.calculator.StringCalcuator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 3.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class StringCalcuatorTest {

    private StringCalcuator cal;

    @Before
    public void setup(){
        cal = new StringCalcuator();
    }

    @Test
    public void splitAndHap(){
//        assertEquals(3, cal.splitAndHap("1,2"));
//        assertEquals(6, cal.splitAndHap("1,2,3"));
//        assertEquals(6, cal.splitAndHap("1,2:3"));
//        assertEquals(0, cal.splitAndHap(" "));
        assertEquals(0, cal.splitAndHap(" "));
        assertEquals(6, cal.splitAndHap("//;\n1;2;3"));

    }

    @Test(expected = RuntimeException.class)
    public void checkException(){
        cal.splitAndHap("1:2:-3");
    }

    @Test
    public void customSplit(){
        assertEquals(";", cal.customSplit("//;\n"));
    }

    @Test
    public void add_null_또는_빈문자(){
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add_숫자하나(){
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_쉼표구분자(){
        assertEquals(3, cal.add("1,2"));
    }

    @Test
    public void add_쉼표_또는_콜론_구분자(){
        assertEquals(6, cal.add("1,2:3"));
    }

    @Test
    public void add_custom_구분자(){
        assertEquals(6, cal.add("//;\n1;2;3"));
    }

    @Test(expected = RuntimeException.class)
    public void add_negative(){
        cal.add("-1,2,3");
    }
}
