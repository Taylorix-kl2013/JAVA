package loops;

public class WhileFor 
{
	public static void main(String[] args) 
	{
	
		double x= 5.5;
	
		while ( x > 0)
		{
			System.out.println(x);
			x--;
		}
		
		for (int x1 = 100; x1 > 0; x1--)
		{
			System.out.println(x1);
		}
		
		if (x % 2 == 0 )
		{
			System.out.println("x ist gerade");
		}
		else if (x % 2 != 0 )
		{
			System.out.println("x ist nicht gerade");
		}
		else
		{
			System.out.println("Diese zahl kann es nicht geben");
		}
		
		
	}

}
