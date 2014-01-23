package maths;

/**
 * 
 * @author Marc
 * 
 */

public class DezBinWandler {

	public static String ConvDecToBin(int deci) {
		boolean done = false;
		String myS = "";
		char[] myC = new char[16];

		for (int i = 0; i < 16; i++) {
			myC[i] = '0';
		}

		while (!done) {
			int x = suchePotenz(deci);
			deci = deci - (int) Math.pow(2, x);
			if (deci > -1) {
				myC[16 - x - 1] = '1';
			}

			if (deci < 0) {
				break;
			}
		}

		for (int i = 0; i < 16; i++) {
			myS = myS + myC[i];
		}
		return myS;
	}

	public static int suchePotenz(int Zahl) {
		int result = 0;

		for (int i = 0; i < Zahl; i++) {

			if (Math.pow(2, i) > Zahl) {
				result = i - 1;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(ConvDecToBin(50841));
	}
}
