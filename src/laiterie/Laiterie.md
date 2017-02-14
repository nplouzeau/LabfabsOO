Exercice sur les patrons de conception Observer et Command : le cas Laktalux

# Contexte

La société agro-alimentaire Laktalux informatise son système de production laitière. Vous allez participer à la mise en place de ce système.

## Vidange des camions

- Le lait est apporté par des camions-citernes qui font la tournée des exploitations laitières (dites fermes à vaches).
- Un camion a une certaine capacité, et est défini par une interface
	- getCapacité()
	- viderDansLaCuve(Cuve c)
- Lorsqu'un camion vide sa citerne il appelle l'opération `remplir` de l'interface `Cuve`, en précisant le nombre de litres ajoutés par la vidange.

**Question 1.** Modéliser le domaine à l'aide de classe et d'interfaces

## Supervision des cuves

Chaque cuve est dotée d'un système de surveillance : à chaque modification du volume contenu, une notification doit être adressée à d'autres parties de l'usine.
Pour réaliser ceci, chaque cuve est dotée d'une opération `inscrire`, qui permet à des objets répondant à l'interface `ObservateurCuve` d'être informé des modifications de volume et donc de prendre d'éventuelles mesures.

**Question 2.** Définir une interface `Cuve`permettant le dépôt de lait depuis un camion-citerne (opération `remplir` à définir).

**Question 3.** Symétriquement, définir une opération `vider` qui prend un volume (en litres) en paramètre pour exprimer qu'une unité de production prélève une partie du lait.

**Question 4.** Compléter l'interface Java `Cuve` pour permettre à une partie de l'usine de s'inscrire, afin d'être informée des changements de niveau d'une cuve. Seules les classes implémentant l'interface `ObservateurCuve` (voir ci-après) peuvent s'inscrire, car sinon une cuve ne saurait pas quelle opération appeler lors d'un changement de niveau.

```
interface ObservateurCuve {
// Cette opération est appelée lorsqu'une cuve voit son niveau changer,
// à condition bien sûr que l'objet implémentant `ObservateurCuve` se soit
// au préalable abonné auprès de la cuve `c` en appelant l'opération `inscrire`

 public void mettreAJour(Cuve c);
}
```
## Sécurité de débordement

**Question 5.** Alerte ! Si le niveau dépasse le maximum autorisé, une alerte doit être déclenchée. Pour ce faire, chaque cuve dispose d'une opération `setAlerteDebordement`, qui permet d'installer une commande qui sera invoquée lors d'un débordement.

```
interface Alerte {
	void executer(Cuve c);
}

```







