package io;

public class Output {
	public static void main(String[] args) {
		
		int x1 =0;
		char a1 ='s';
		boolean b1 = true;
		double d1 =3.14;
		
		
		/***********************************Strings***********************************************/
		String myString="Rotk�ppchen";
		System.out.println(myString.endsWith("chen")); // pr�ft ob String mit "chen" endet. gibt True oder false zur�ck
				
		
		
		
		
		/***********************************Arrays***********************************************/
		
		/*Deklaration/Initialisierung/Wertzuweisung*/
		String[] myStringArr = new String[100];
		myStringArr[1] = "a";
		
		double[] myDoubleArr = new double[100];
		myDoubleArr[1] = 1.2;
		
		int[] myIntArr = new int[100];
		myIntArr[1] = 25;
		
		
		
		/*Ausgaben*/
		
		//Methode der Klasse Array
		System.out.println(myStringArr.clone());//erzeugt und gibt eine Kopie des Objekts aus
		
		//Funktion der Klasse Array
		System.out.println(myStringArr.length); //gibt L�nge des Strings zur�ck
		
		//Gibt komplettes Array auf Bildschirm aus
		for(int i = 0;i < myIntArr.length ;i++)
		{
			System.out.println(myIntArr[i]);
			
		}
	}
}
