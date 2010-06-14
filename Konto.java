package kraus;

/**
 * Die Kontoklasse mit dem eigentlichen Kontostand, im Konstruktor wird der Kontostand auf 1000 gesetzt.
 * @author Christian Kraus
 * @version 2010-04-11
 */
public class Konto {
	private int stand;
	/**
	 * Setzt den Kontostand defaultmäßig auf 1000.
	 */
	public Konto () {
		this.stand=10;
	}
	public void setKonto (int stand) {
		this.stand=stand;
	}
	public int getKonto () {
		return this.stand;
	}
}
