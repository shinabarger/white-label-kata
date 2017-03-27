import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidshinabarger on 3/27/17.
 */

public class MainTest {

    //setup basic testing template
    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Main.answer();
        assertEquals(expected, actual);
    }

    @Test
    public void main() throws Exception {
        
    }


}