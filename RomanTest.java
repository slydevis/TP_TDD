import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Guillaume on 14/02/14.
 */
public class RomanTest {
    @Before
    public void setUp() throws Exception {
        Roman rom = new src.Roman();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testI()
    {
        assertEquals(1,rom.exec("I"));
    }
}
