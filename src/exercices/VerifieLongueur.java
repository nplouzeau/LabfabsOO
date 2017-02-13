package exercices;

public class VerifieLongueur implements Filtre {

	private int longueurMaximale = 10;

	public VerifieLongueur(int maximumAcceptable) {
		longueurMaximale = maximumAcceptable;
	}

	@Override
	public boolean chaineAcceptable(String chaine) {
		if (chaine == null) {
			throw new IllegalArgumentException("parametre null");
		}
		return (chaine.length() <= longueurMaximale);
	}

}
