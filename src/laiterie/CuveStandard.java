package laiterie;

import java.util.Collection;

public class CuveStandard implements Cuve {
	private Collection<ObservateurCuve> observateurs;
	private final int capacite = 100000;
	private int niveau;

	/**
	 * Ajoute le volume dans la cuve.
	 * @param volume le à ajouter dans la cuve
	 * @throws IllegalArgumentException si volume <= 0
	 */
	@Override
	public void remplir(int volume) {
		if(volume <= 0) {
			throw new IllegalArgumentException();
		}
		niveau = niveau + volume;
	}

	@Override
	public void vider(int volume) {
		niveau = niveau - volume;
	}

	@Override
	public void inscrire(ObservateurCuve obs) {
		observateurs.add(obs);

	}

}
