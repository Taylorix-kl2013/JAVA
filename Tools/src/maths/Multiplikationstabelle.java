package maths;

public class Multiplikationstabelle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] myIntArr = new int[11][11];

		for (int z = 1; z < 11; z++) {
			for (int i = 1; i < 11; i++) {
				myIntArr[z][i] = z * i;
			}
		}
		// Ausgabe
		System.out.println("X     1  2  3  4  5  6  7  8  9 10");
		System.out.println("___________________________________________");

		for (int i = 1; i < 11; i++) {

			if (i < 10) {
				System.out.print(i + " | ");
			} else {
				System.out.print(i + "| ");
			}

			for (int j = 1; j < 11; j++) {
				if (myIntArr[i][j] < 10) {
					System.out.print("  " + myIntArr[i][j]);

				} else {
					System.out.print(" " + myIntArr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
