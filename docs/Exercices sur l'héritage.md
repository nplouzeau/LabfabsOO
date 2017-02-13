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

**Question 1.** Définir une classe `VerifieLongueur` qui implémente l'interface Filtre en retournant `true` lors de l'appel à `chaineAcceptable` si et seulement si la chaîne passée en paramètre est de longueur inférieure à un maximum défini lors de l'instantiation d'un objet de la classe `VerifieLongueur`.

Conseils :

- Commencez par écrire une classe de test `VerifieLongueurTest`, selon le procédé vu en cours
- Vous aurez besoin de définir explicitement un constructeur, voir la vidéo EPFL nommée `Constructeurs par défaut`.

**Question 2.** Définir une classe `ListeVerifiee` qui hérite de `ArrayList<String>` et  modifie la méthode `add` de cette classe pour interdire d'ajouter des `String` qui ne satisfont pas le filtre.

```
public class ListeVerifiee extends ArrayList<String> { //TODO
	@Override
	public boolean add(String chaine) { //TODO
	}
}
```

Conseils :

- Là aussi, commencez par écrire votre classe de test
- Vous aurez besoin de définir un constructeur qui prend un objet de type `Filtre` en paramètre. Cet objet sera utilisé dans votre implémentation de `add(String)`.

 ## Exercice 4
 
 **Question 1.** Ecrivez une classe `ExtraireAcceptable` qui fabrique une liste des chaînes `String` acceptables (au sens de l'exercice précédent, interface `Filtre`) présentes dans une liste de `String` donnée. Le filtre sera passé en paramètre de l'opération de fabrication.
 N'oubliez pas les cas de tests.
 
 **Question 2.** Reprenez l'algorithme de tri vu précédemment pour trier une liste de `String` en utilisant une fonction de comparaison de `String` définie par l'utilisateur. Commentez l'efficacité de votre mise en œuvre.
  