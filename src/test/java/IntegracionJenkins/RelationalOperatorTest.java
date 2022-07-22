package IntegracionJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class RelationalOperatorTest {

	@Test
	public void isGreaterTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 3));
	}
	
	@Test
	public void isGreaterTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isGreater(2, 1));
	}
	
	@Test
	public void isGreaterTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(5, 5));
	}

	@Test
	public void isLessTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isLess(4, 5));
	}
	
	@Test
	public void isLessTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(5, 1));
	}

	@Test
	public void isLessTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(4, 4));
	}

	@Test
	public void goodWidthTest1() {
		System.setOut(new PrintStream(outContent));
		RelationalOperator tester = new RelationalOperator();
		tester.goodWidth(4, 2, 7);
		assertEquals("The width is correct", outContent.toString().trim());
		System.setOut(originalOut);
	}

	@Test
	public void goodWidthTest2() {
		System.setOut(new PrintStream(outContent));
		RelationalOperator tester = new RelationalOperator();
		tester.goodWidth(4, 2, 3);
		assertEquals("The width is INCORRECT", outContent.toString().trim());
		System.setOut(originalOut);
	}

	@Test
	public void goodWidthTest3() {
		System.setOut(new PrintStream(outContent));
		RelationalOperator tester = new RelationalOperator();
		tester.goodWidth(4, 5, 7);
		assertEquals("The width is INCORRECT", outContent.toString().trim());
		System.setOut(originalOut);
	}
}
