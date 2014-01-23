package others;

public class Kalender {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] Tage = new int[365];
		for(int i=0;i<365;i++){
			Tage[i] = i+1;
		}
		for(int n : Tage)
		{
			System.out.println(n+" "  + "Täge haben " + n*24 + " Stunden");
		}
	}

}
