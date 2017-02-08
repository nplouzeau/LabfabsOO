package exercices;

public class Cercle {
	private double rayon;

	public double getRayon() {
		return rayon;
	}
	
	public void setRayon(double r) {
		if(r <= 0) {
			throw new IllegalArgumentException();
		}
		rayon = r;
	}
	
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
	public void quadrupler() {
		rayon = 2 * rayon;
	}
}
