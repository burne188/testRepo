package lab0.P1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ABunchOfObjectMethodsTest {
	
	ABunchOfObjectMethods test = new ABunchOfObjectMethods();
	Puppy aPuppy = test.getPuppy("Oliver", 35);

	@Test
	public void testGetPuppy() {
		assertEquals(aPuppy.name, "Oliver");
		assertEquals(aPuppy.weight, 35);
	}

	@Test
	public void testGetTotalWeight() {
		Puppy puppylist[] = {test.getPuppy("Sam", 12), test.getPuppy("Morgan", 47), test.getPuppy("Paul", 2)};
		assertEquals(test.getTotalWeight(puppylist), 61);
	}

	@Test
	public void testFeedPuppy() {
		test.feedPuppy(aPuppy, 10);
		assertEquals(aPuppy.weight, 45);
	}

	@Test
	public void testKnightPuppy() {
		test.knightPuppy(aPuppy);
		assertEquals(aPuppy.hasSword, true);
		assertEquals(aPuppy.isKnight, true);
	}

}
