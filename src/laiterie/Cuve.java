package laiterie;

public interface Cuve {

	public void remplir(int volume);
	
	public void vider(int volume);

	public void inscrire(ObservateurCuve obs);
	
	public int getNiveau();
	
}
