package exercices;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author plouzeau
 *
 *         Traite des listes de String dans le but de faire travailler les
 *         étudiants du Labfab
 * 
 */
public class ExtraireAcceptable {

	/**
	 * Cree une nouvelle liste à partir de listeAFiltrer
	 * en ne gardant que les éléments acceptés par le filtre
	 * @param listeAFiltrer liste en entrée
	 * @param filtre algorithme de filtrage
	 * @return une liste filtrée
	 * @throws IllegalArgumentException si il existe un
	 * paramètre à null
	 */
	public List<String> obtenirCopieFiltree(List<String> listeAFiltrer, 
			Filtre filtre) {
		List<String> resultat = new ArrayList<>();
		
		if((listeAFiltrer == null) || (filtre == null)) {
			throw new IllegalArgumentException();
		}
		for(String chaine : listeAFiltrer) {
			if(filtre.chaineAcceptable(chaine)) {
				resultat.add(chaine);
			}
		}
		return resultat;

	}
}
