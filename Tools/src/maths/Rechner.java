package maths;

import java.util.Scanner;

public class Rechner {

	public static void main(String[] args) {
		int x;
		int y;

		int Eingabe;
		int Ergebnis = 0;
		Scanner scan1 = new Scanner(System.in);

		System.out.print("geben Sie die erste Zahl ein : ");
		Eingabe = Integer.parseInt(scan1.nextLine());
		x = Eingabe;

		System.out.print("geben Sie die erste Zahl ein : ");
		Eingabe = Integer.parseInt(scan1.nextLine());
		y = Eingabe;

		System.out.println("Wählen sie eine der folgenden Operationen: ");
		System.out.println("1. addieren");
		System.out.println("2. subtrahieren");
		System.out.println("3. multiplizieren");
		System.out.println("4. dividieren");

		Eingabe = Integer.parseInt(scan1.nextLine());

		if (Eingabe == 1) {
			Ergebnis = x + y;
		}
		if (Eingabe == 2) {
			Ergebnis = x - y;
		}
		if (Eingabe == 3) {
			Ergebnis = x * y;
		}
		if (Eingabe == 4) {
			Ergebnis = x / y;
		}
		if (Eingabe > 4) {
			System.out.println("Falsche Eingabe");
		} else {
			System.out.println("Das gewünschte Ergebnis lautet : " + Ergebnis);
		}
		scan1.close();

	}

}
