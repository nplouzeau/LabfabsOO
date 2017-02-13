/**
 * 
 */
package exercices;

import java.util.ArrayList;

/**
 * @author plouzeau
 *
 * Etend la classe ArrayList pour vérifier que les éléments sont conformes
 * à un filtre défini lors de la création de la liste.
 */
public class ListeVerifiee extends ArrayList<String> {

	private Filtre verificateur;

	public ListeVerifiee(Filtre verificateur) {
		this.verificateur = verificateur;
	}
	
	@Override
	public boolean add(String chaine) {
		if(verificateur.chaineAcceptable(chaine)) {
			return super.add(chaine);
		}
		else {
			return false;
		}
	}
}
