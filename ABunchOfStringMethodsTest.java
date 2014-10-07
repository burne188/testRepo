package lab0.P1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ABunchOfStringMethodsTest {
	
	ABunchOfStringMethods test = new ABunchOfStringMethods();
	String Photo = "Ocean.png";

	@Test
	public void testIsAPicture() {
		assertEquals(test.isAPicture(Photo), true);
	}

	@Test
	public void testIsBob() {
		assertEquals(test.isBob("BoB"), true);
	}

	@Test
	public void testSayHelloTo() {
		assertEquals(test.sayHelloTo("Timmy"), "Hello Timmy");
	}

	@Test
	public void testShouldSkipLine() {
		assertEquals(test.shouldSkipLine(Photo), false);
	}

}
