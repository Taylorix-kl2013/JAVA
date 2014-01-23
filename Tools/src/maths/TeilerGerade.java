package maths;

/**
 * 
 * @author Marc
 * 
 */
public class TeilerGerade {

	/**
	 * Dieses Programm gibt alle Teiler von 1000 aus, die ein gerades Ergebniss
	 * liefern
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myIntArr = new int[1000];
		myIntArr[0] = 0;

		for (int i = 1; i < myIntArr.length; i++) {
			if (1000 % i == 0) {
				myIntArr[i] = i;
			} else {
				myIntArr[i] = 0;
			}
		}

		for (int i = 0; i < myIntArr.length; i++) {
			if (myIntArr[i] != 0) {
				System.out.println(myIntArr[i]);
			}
		}
		System.out.println("1000");

	}

}
