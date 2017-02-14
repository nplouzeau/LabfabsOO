package laiterie;

public class Iveco implements Camion {

	private final int capacite = 10000;
	private int niveau;

	@Override
	public int getCapacite() {
		return capacite;
	}

	@Override
	public void viderDansLaCuve(Cuve c) {
		c.remplir(niveau);
		niveau = 0;
	}

}
