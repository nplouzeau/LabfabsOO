package exercices;

public class Rectangle implements Forme {
	private double largeur;
	private double hauteur;

	public double getLargeur() {
		return largeur;
	}
	
	public double getHauteur() {
		return hauteur;
	}
	
	public void setLargeur(double l) {
		if(l <= 0) {
			throw new IllegalArgumentException();
		}
		largeur = l;
	}
	
	public void setHauteur(double h) {
		if(h <= 0) {
			throw new IllegalArgumentException();
		}
		hauteur = h;
	}
	
	public double surface() {
		return largeur * hauteur;
	}
	
	public void quadrupler() {
		largeur = 2 * largeur;
		hauteur = 2 * hauteur;
	}
}
