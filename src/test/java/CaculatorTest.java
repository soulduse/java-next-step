import com.book.soulduse.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 27.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */

public class CaculatorTest {

    private Calculator cal;

    @Before
    public void setup(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add() {
        assertEquals(9, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void subtract() {
        assertEquals(3, cal.subtract(6, 3));
        System.out.println("subtract");
    }

    @After
    public void teardown(){
        System.out.println("teardown");
    }
}
