package maths;

import java.util.Scanner;

public class Linear_Funktion {

	private static Scanner scan1;

	public static void main(String[] args) {
		int m = 2;
		int n = -5;
		scan1 = new Scanner(System.in);
		int auswahl;

		System.out.println("Gegeben ist die Funktion y= 2(m)*x-5(n)");
		System.out.println("1. Funktionswerteberechnung");
		System.out.println("2. Zähle wie viele Funktionswerte über 0 sind");
		System.out.println();
		System.out.print("Auswahl: ");

		auswahl = Integer.parseInt(scan1.nextLine());

		if (auswahl == 1) {
			for (int x = 0; x < 21; x++) {
				int y = (m * x) + n;
				System.out.println("y = " + y + " wenn x = " + x);
			}
		}
		if (auswahl == 2) {
			int y = 1;
			int zähler = 0;
			System.out.print("Bitte geben sie den höchsten x Wert ein : ");
			int x = Integer.parseInt(scan1.nextLine());
			do {

				y = (m * x) + n;

				x--;
				if (y > 0) {
					System.out.println("y = " + y + " wenn x = " + x);
					zähler++;
				}

			} while (y > 0);
			System.out
					.println("Es sind " + zähler + " Funktionswerte über 0");
		}

	}

}
