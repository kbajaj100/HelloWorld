
public class Chapt15Part8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int rows = 13;
		final int cols = 4;

		
		String[][] deck = new String[rows][cols];
		
		String suit = "";
		//int num = 2;
				
		for (int c = 1; c <= cols; ++c)
		{	
			
			/*if (c == 1)
				suit = "Hearts";
			else if (c == 2)
				suit = "Diamonds";
			else if (c == 3)
				suit = "Spades";
			else 
				suit = "Clubs";
			*/
			
			switch (c)
			{
				case 1: 
				{	
					suit = "Hearts";
					break;
				}
				case 2:	
				{	
					suit = "Diamonds";
					break;
				}
				case 3: 
				{	
					suit = "Spades";
					break;
				}
				default: suit = "Clubs";
			}
			
		
			System.out.println(c);
			System.out.println(suit);
		
		
			for(int r = 2; r <= rows+1; ++r)
			{
				
				switch (r)
				{
					case 11: 
					{	
						deck[r-2][c-1] = ("Jack of " + suit);
						continue;
					}
					case 12: 
					{	
						deck[r-2][c-1] = ("Queen of " + suit);
						continue;
					}
					case 13: 
					{
						deck[r-2][c-1] = ("King of " + suit);
						continue;
					}
					case 14: 
					{	
						deck[r-2][c-1] = ("Ace of " + suit);
						continue;
					}
					default: deck[r-2][c-1] = (r + " of " + suit);
				}
			}
		}

	
		for (int c = 0; c < cols; ++c)
		{
			for(int r = 0; r < rows; ++r)
				System.out.println(deck[r][c]);
		}
	}	
	
	
}
