package exercices;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testSetLargeur() {
		Rectangle rect1 = new Rectangle();

		rect1.setLargeur(10.0);

		assertEquals(10.0, rect1.getLargeur(), 10e-20);
	}

	@Test
	public void testSurface() {
		Rectangle rect1 = new Rectangle();

		rect1.setLargeur(10.0);
		rect1.setHauteur(20.0);

		assertEquals(200.0, rect1.surface(), 10e-20);
	}

	@Test
	public void testQuadrupler() {
		Rectangle rect1 = new Rectangle();

		rect1.setLargeur(10.0);
		rect1.setHauteur(20.0);
		rect1.quadrupler();

		assertEquals(800.0, rect1.surface(), 10e-20);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testRobustesse() {
		Rectangle rect1 = new Rectangle();
		rect1.setLargeur(-1.0);
	}
}
