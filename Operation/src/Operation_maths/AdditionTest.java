package Operation_maths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	Addition add;

	@Before
	public void setUp() throws Exception {
		add = new Addition();
	}

	@Test
	public void Test5() {
		assertEquals(5, add.exec(3,2));
	}
	
	@Test
	public void Test42() {
		assertEquals(42, add.exec(2,40));
	}

}
