package lab0.P1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ABunchOfNumberMethodsTest {

	ABunchOfNumberMethods test = new ABunchOfNumberMethods();
	
	@Test
	public void testAdd() {
		assertEquals(test.add(3,4),7);
	}

	@Test
	public void testConvertToIntDouble() {
		assertEquals(test.convertToInt(2.3), 2);
	}

	@Test
	public void testConvertToIntString() {
		assertEquals(test.convertToInt("5"), 5);
	}

	@Test
	public void testDivide() {
		assertEquals(test.divide(4,2),2.0,.0001);
	}

	@Test
	public void testRemainder() {
		assertEquals(test.remainder(6,4),2);
	}

}
