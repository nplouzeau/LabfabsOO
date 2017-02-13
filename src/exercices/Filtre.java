/**
 * 
 */
package exercices;

/**
 * @author plouzeau
 *
 * Indique si une String est acceptable ou non
 * selon des critères définis dans les classes implémentant
 * cette interface.
 * 
 */
public interface Filtre {
/**
 * Prédicat de test de propriétés de chaîne
 * @param chaine à tester, doit être non null
 * @return true si et seulement si la chaîne satisfait les
 * critères de filtrage
 * @throws IllegalArgumentException si le paramètre chaine est null
 */
	public boolean chaineAcceptable(String chaine);
	
}
