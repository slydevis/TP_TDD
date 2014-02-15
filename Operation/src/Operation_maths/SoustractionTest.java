package Operation_maths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SoustractionTest {
	
	Soustraction sous;
	
	@Before
	public void setUp() throws Exception {
		sous = new Soustraction();
	}

	@Test
	public void Test5() {
		assertEquals(5, sous.exec(7,2));
	}
	
	@Test
	public void Test42() {
		assertEquals(42, sous.exec(50, 8));
	}
}
