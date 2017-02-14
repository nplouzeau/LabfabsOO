package laiterie;

public class CuveStandard implements Cuve {

	private final int capacite = 100000;
	private int niveau;

	@Override
	public void remplir(int volume) {
		niveau = niveau + volume;
	}

}
