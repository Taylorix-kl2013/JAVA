package statements;

public class IF_statement {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{ 
		int zahl1 = 9;
		int rest;
		// boolean x = zahl
		rest = zahl1 % 2;

		
		
		if( rest == 0)
		{
			System.out.println( zahl1 + " ist gerade");
		}
		else
		{
			System.out.println( zahl1 + " ist nicht gerade");
		}
	}

}
