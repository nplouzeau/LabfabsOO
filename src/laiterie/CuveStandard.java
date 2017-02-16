package laiterie;

import java.util.Collection;

public class CuveStandard implements Cuve {
	private Collection<ObservateurCuve> observateurs;
	private final int capacite = 100000;
	private int niveau;

	/**
	 * Ajoute le volume dans la cuve.
	 * 
	 * @param volume
	 *            le à ajouter dans la cuve
	 * @throws IllegalArgumentException
	 *             si volume <= 0
	 */
	@Override
	public void remplir(int volume) {
		if (volume <= 0) {
			throw new IllegalArgumentException();
		}
		niveau = niveau + volume;
		notifierObservateurs();
	}

	@Override
	public void vider(int volume) {
		// TODO ajouter le gardien
		niveau = niveau - volume;
		notifierObservateurs();
	}

	@Override
	public void inscrire(ObservateurCuve obs) {
		// TODO ajouter le gardien
		observateurs.add(obs);

	}

	private void notifierObservateurs() {
		// Prévenir tous les observateurs de cette cuve
		// que le niveau a changé
		for (ObservateurCuve obs : observateurs) {
			obs.mettreAJour(this);
		}
	}

	@Override
	public int getNiveau() {
		return niveau;
	}
}
