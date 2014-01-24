package declarations;

public class Integer {

	/**
	 * @param args
	 */
	public Integer(String[] args)
	{
		
		int   x=5;
		int   y=12;
		int   z=3;
		int   ergebnis;
		
		String meintext = "Ergebnis von " + x + " * " + y + " * " + z + " ist : "; 
		ergebnis = x*y*z;
		System.out.println(meintext + ergebnis);

	}

}
