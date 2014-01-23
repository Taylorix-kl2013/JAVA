package maths;

/**
 * 
 * @author Marc
 * 
 */
public class Primzahlen {
	/**
	 * Das Programm gibt alle Primzahlen bis zu einer bestimmten Zahl aus
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// x ist die zu untersuchende Zahl
		int x = 2;

		// istPrim ist wahr, wenn x eine Primzahl ist
		boolean istPrim = false;

		// Das ist die obere Schleife, hier werden die Primzahlen gezählt
		for (int i = 1; i < 1000;) {

			// Das ist die Schleife, die jedes x überprüft, ob es eine Primzahl
			// ist
			for (int j = 2; j < x; j++) {
				istPrim = (x % j != 0);
				if (!istPrim) {
					break;
				}
			}
			// Ende der Überprüfung von x

			// Wenn x eine Primzahl ist, also istPrim == true, dann wird
			// die i-Variable, also der Primzahlenzähler um 1 erhöht
			if (istPrim) {
				i++; // der Primzahlenzähler wird inkrementiert
				System.out.println(i + " : " + x);
			}
			x++; // die zu untersuchende Zahl wird erhöht
		}
	}
}
