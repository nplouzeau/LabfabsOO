package exercices;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ExtraireAcceptableTest {

	private List<String> listeEnEntree;
	private ExtraireAcceptable extraireAcceptable;

	@Before
	public void setUp() throws Exception {
		listeEnEntree = Arrays.asList("abcdefgh", "abcd");
		extraireAcceptable = new ExtraireAcceptable();
	}

	@Test
	public void testObtenirCopieFiltree() {
		Filtre filtre = new VerifieLongueur(5);
		List<String> resultat;

		resultat = extraireAcceptable.obtenirCopieFiltree(listeEnEntree, filtre);
		assertTrue(resultat.contains("abcd"));
		assertFalse(resultat.contains("abcdefgh"));
	}

	@Test
	public void testListeVide() {
		List<String> resultat;
		Filtre filtre = new VerifieLongueur(5);

		resultat = extraireAcceptable.obtenirCopieFiltree(new LinkedList<>(), filtre);
		assertTrue(resultat.isEmpty());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGardien1() {
		extraireAcceptable.obtenirCopieFiltree(null, null);
	}

}
