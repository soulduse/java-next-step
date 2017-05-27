import com.book.soulduse.Calculator;
import org.junit.Test;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 27.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */

public class CaculatorTest {

    @Test
    public void add() {
        Calculator cal = new Calculator();
        System.out.println(cal.add(6, 3));
    }

    @Test
    public void substarct() {
        Calculator cal = new Calculator();
        System.out.println(cal.substract(6, 3));
    }
}
