package laiterie;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuveTest {

	private Cuve cuveATester;

	@Before
	public void setUp() throws Exception {
		cuveATester = new CuveStandard();

	}

	@Test
	public void testRemplir() {
		cuveATester.remplir(1000);
		assertEquals(1000, cuveATester.getNiveau());
	}

	@Test
	public void testVider() {
		cuveATester.remplir(1000);
		cuveATester.vider(500);
		assertEquals(500, cuveATester.getNiveau());
	}
	
	private class Verificateur implements ObservateurCuve {

		private boolean fait = false;
		
		@Override
		public void mettreAJour(Cuve c) {
			fait = true;		
		}
		
	}
	
	@Test
	public void testNotification() {
		Verificateur verificateur = new Verificateur();
		
		cuveATester.inscrire(verificateur);
		
		cuveATester.remplir(1000);
		assertTrue(verificateur.fait);
	}
	
	private class VerificateurAlerte implements Alerte {
		private boolean fait = false;

		@Override
		public void executer() {
			fait = true;
		}
		
	}
	@Test
	public void testAlerte() {
		VerificateurAlerte alerteDeTest = new VerificateurAlerte();
		
		cuveATester.setAlerteDebordement(alerteDeTest);
		
		// On provoque un débordement
		
		cuveATester.remplir(120000);
		
		assertTrue(alerteDeTest.fait);
	}
	
}
