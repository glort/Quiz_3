package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea() {
		Triangle T = new Triangle(3,4,5);
		assertTrue(T.getArea() == 6);
	}

	@Test
	public void testGetPerimeter() {
		Triangle T = new Triangle(3,4,5);
		assertTrue(T.getPerimeter() == 12);

	}

}
