package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 3.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class SplitTest {
    @Test
    public void split(){
        assertArrayEquals(new String[]{"1"}, "1".split(","));
        assertArrayEquals(new String[]{"1","2"}, "1,2".split(","));
    }
}
