package exercices;

import java.util.logging.Logger;

public class PremierExemple {

	public static void main(String[] args) {
		/*
		 * Exercice 1 Crée un tableau et initialise celui-ci de sorte que le
		 * premier élément ait la valeur 1, le deuxième la valeur 2, etc
		 */
		final int tailleTableau = 10;
		int[] tableau = new int[tailleTableau];
		System.err.println("Exercice 1");
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = i + 1;
		}
		//ecrireTableau(tableau);
		exo2();
	}

	private static void exo2() {
		System.err.println("Exo 2");
		final int tailleTableau = 3;
		int[] tableau1 = new int[tailleTableau];
		tableau1[0] = 1;
		tableau1[1] = 2;
		tableau1[2] = 3;
		int[] tableau2 = new int[tailleTableau+1];
		tableau2[0] = 1;
		tableau2[1] = 1;
		tableau2[2] = 1;
		tableau2[3] = 1;
		ajouterTableau(tableau1, tableau2);
		ecrireTableau(tableau1);
	}

	private static void ajouterTableau(int[] tableauCible, int[] tableauAjouter) {
		if (tableauCible.length == tableauAjouter.length) {
			for (int i = 0; i < tableauCible.length; i++) {
				tableauCible[i] = tableauCible[i] + tableauAjouter[i];
			}
		} else {
			Logger.getGlobal().severe("N'importe quoi ! Les tableaux sont de taille différentes");
		}

	}

	private static void ecrireTableau(int[] tableauAEcrire) {
		for (int i = 0; i < tableauAEcrire.length; i++) {
			System.err.println("tableau[" + i + "] : " + tableauAEcrire[i]);
		}
	}

}
