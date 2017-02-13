package exercices;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VerifieLongueurTest {

	private Filtre f;
	
	@Before
	public void setup() {
		f = new VerifieLongueur(10);
	}
	
	@Test
	public void testChaineAcceptable1() {
		 
		assertTrue(f.chaineAcceptable("abcd"));
	}
	
	@Test
	public void testTropLong() {
		assertFalse(f.chaineAcceptable("123456789ABCD"));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testGardien() {
		f.chaineAcceptable(null);
	}
}
