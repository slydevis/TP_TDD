package Operation_maths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {

	Multiplication mult;
	
	@Before
	public void setUp() throws Exception {
		mult = new Multiplication();
	}

	@Test
	public void Test16() {
		assertEquals(16, mult.exec(4, 4));
	}

	@Test
	public void Test8() {
		assertEquals(8, mult.exec(4, 2));
	}
}
