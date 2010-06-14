package kraus;

/**
 * Die Kontoklasse mit dem eigentlichen Kontostand, im Konstruktor wird der Kontostand auf 1000 gesetzt.
 * @author Christian Kraus
 * @version 2010-04-11
 */
public class Konto {
	private int stand;
	private int kontostand;
	/**
	 * Setzt den Kontostand defaultm‰ﬂig auf 1000.
	 */
	public Konto () {
		this.kontostand=1000;
	}
	public void setKonto (int kontostand) {
		this.kontostand=kontostand;
	}
	public int getKonto () {
		return this.kontostand;
	}
}
