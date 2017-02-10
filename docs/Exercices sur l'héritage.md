Exercices DU Labfab 2017-02-10

# Exercices sur l'héritage

## Exercice 1

**Prérequis** : avoir vu la séquence nommée `IntroPOO/Semaine 3/Héritage` du cours de l'EPFL.

**Question.** Au moyen de la documentation en ligne de la [bibliothèque Java](https://docs.oracle.com/javase/7/docs/api/overview-summary.html), déterminez la hiérarchie des interfaces et des classes ancêtres de `ArrayList`.

**Question.** Représentez la hiérarchie des classes et interfaces des ancêtres de `ArrayList` en utilisant la représentation graphique employée dans le cours de l'EPFL (_cf_ la vidéo Héritage à 10:10).

**Question.** Combien de méthodes sont accessibles dans `ArrayList` ?

## Exercice 2

On considère les alternatives de code suivantes :

```
ArrayList<String> liste1 = new ArrayList<>();

List<String> liste2 = new ArrayList<>();

Collection<String> liste3 = new ArrayList<>;

```

**Question.** En utilisant la Javadoc de la bibliothèque standard, indiquez quelle est la déclaration la plus générale. Justifiez votre réponse, en expliquant l'intérêt de ce choix. 

## Exercice 3

On considère la déclaration d'interface Filtre, qui permet de définir si une chaîne de caractère (String) est acceptable selon certains critères.

```
public interface Filtre {

	public boolean chaineAcceptable(String chaine);
	
}

```

**Question.** Définir une classe `VerifieLongueur` qui implémente l'interface Filtre en retournant `true` lors de l'appel à `chaineAcceptable` si et seulement si la chaîne passée en paramètre est de longueur inférieure à un maximum définit lors de l'instantiation d'un objet de la classe `VerifieLongueur`.

Conseils :

- Commencez par écrire une classe de test `VerifieLongueurTest`, selon le procédé vu en cours
- Vous aurez besoin de définir explicitement un constructeur, voir la vidéo EPFL nommée `Constructeurs par défaut`.
