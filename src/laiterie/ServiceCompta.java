package laiterie;

import java.util.logging.Logger;

public class ServiceCompta implements ObservateurCuve {

	@Override
	public void mettreAJour(Cuve c) {
		Logger.getGlobal().info("Le niveau de la cuve " + c + " a changé : " + c.getNiveau() + " litres");
	}

}
