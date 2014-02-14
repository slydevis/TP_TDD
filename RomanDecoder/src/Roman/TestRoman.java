/**
 * 
 */
package Roman;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Guillaume
 *
 */
public class TestRoman {

	Roman rom;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		rom = new Roman();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testI() {
		assertEquals(1, rom.decode("I"));
	}
	
	@Test
	public void testII() {
		assertEquals(2, rom.decode("II"));
	}
	
	@Test
	public void testV() {
		assertEquals(5, rom.decode("V"));
	}
	
	@Test
	public void testIV() {
		assertEquals(4, rom.decode("IV"));
	}
	
	@Test
	public void testX() {
		assertEquals(10, rom.decode("X"));
	}
	
	@Test
	public void testIX() {
		assertEquals(9, rom.decode("IX"));
	}
	
	@Test
	public void testL() {
		assertEquals(50, rom.decode("L"));
	}
	
	@Test
	public void testLX() {
		assertEquals(60, rom.decode("LX"));
	}
	
	@Test
	public void testLL() {
		assertEquals(100, rom.decode("LL"));
	}
	
	@Test
	public void testXL() {
		assertEquals(40, rom.decode("XL"));
	}
	
	@Test
	public void testC() {
		assertEquals(100, rom.decode("C"));
	}
	
	@Test
	public void testXC() {
		assertEquals(90, rom.decode("XC"));
	}
	
	@Test
	public void testCCCLXIX() {
		assertEquals(369, rom.decode("CCCLXIX"));
	}
	
	@Test
	public void testD() {
		assertEquals(500, rom.decode("D"));
	}
	
	@Test	
	public void testDD() {
		assertEquals(1000, rom.decode("DD"));
	}
	
	@Test
	public void testCD() {
		assertEquals(400, rom.decode("CD"));
	}
	
	@Test
	public void testCDXLVIII() {
		assertEquals(448, rom.decode("CDXLVIII"));
	}
	
	@Test
	public void testM()
	{
		assertEquals(1000, rom.decode("M"));
	}
	
	@Test
	public void testMM()
	{
		assertEquals(2000, rom.decode("MM"));
	}
	
	@Test
	public void testMCMXCVIII()
	{
		assertEquals(1998, rom.decode("MCMXCVIII"));
	}
	
	public void testMCT()
	{
		assertEquals(1100, rom.decode("MCT"));
	}
	
	@Test(expected=ArithmeticException.class)
	public void TTT ()
	{
		rom.decode("TTT");	
	}
	
	@Test(expected=ArithmeticException.class)
	public void TDD ()
	{
		rom.decode("TDD");
	}
}
