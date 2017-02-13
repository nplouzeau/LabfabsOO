package exercices;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListeVerifieeTest {

	private ListeVerifiee liste;
	private final int maximumAcceptable = 6;

	@Before
	public void setUp() throws Exception {

		liste = new ListeVerifiee(new VerifieLongueur(maximumAcceptable));
	}

	@Test
	public void testAjoutAcceptable() {
		String chaineDeTest = "abcd";

		assertTrue(liste.add(chaineDeTest));
		assertTrue(liste.contains(chaineDeTest));
	}

	@Test
	public void testAjoutInacceptable() {
		String chaineDeTest = "abcdefghijkl";

		assertFalse(liste.add(chaineDeTest));
		assertFalse(liste.contains(chaineDeTest));
	}

}
