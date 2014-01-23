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

		// Das ist die obere Schleife, hier werden die Primzahlen gez�hlt
		for (int i = 1; i < 1000;) {

			// Das ist die Schleife, die jedes x �berpr�ft, ob es eine Primzahl
			// ist
			for (int j = 2; j < x; j++) {
				istPrim = (x % j != 0);
				if (!istPrim) {
					break;
				}
			}
			// Ende der �berpr�fung von x

			// Wenn x eine Primzahl ist, also istPrim == true, dann wird
			// die i-Variable, also der Primzahlenz�hler um 1 erh�ht
			if (istPrim) {
				i++; // der Primzahlenz�hler wird inkrementiert
				System.out.println(i + " : " + x);
			}
			x++; // die zu untersuchende Zahl wird erh�ht
		}
	}
}
