package io;

import java.util.Scanner;

public class Input {

	private static Scanner scan1;

	public static void main(String[] args) {
		String eingabe;
		
		scan1 = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		eingabe = scan1.nextLine();
		
		System.out.println( );
        System.out.println("Sie haben folgende Zahl eingegeben : " + eingabe);		
		

	}

}
