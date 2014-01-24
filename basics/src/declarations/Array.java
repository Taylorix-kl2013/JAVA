package declarations;

public class Array {
	
	public static void main(String[] args){
		
		//Deklaration
		String s1;
		
		//Deklaration + Initialisierung
		String s2 = new String();
		
		//Deklaration + Initialisierung + Wertzuweisung
		String s3 = new String("blah blah");
		
		//Arrays
		
		//Deklaration
		int[] myIntArr;
		
		//Initialisierung
		myIntArr = new int[100];
		
		//Wertzuweisung
		for (int i=0;i<100;i=i+1){
			myIntArr[i]=2*i;
		}
		
		//Ausgabe
		for(int i=0;i<100;i=i+1){
			System.out.println(myIntArr[i]);
		}
		
	}

}
