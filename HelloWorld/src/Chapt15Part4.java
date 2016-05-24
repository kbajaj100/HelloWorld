import java.util.Random;

// How to create a 2-D array
public class Chapt15Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final int rows = 5;
	final int cols = 5;
	Random rand = new Random(System.currentTimeMillis());
	
	int[][] numbers = new int[rows][cols];
	for(int r = 0; r< rows; ++r)
	{
		for (int c = 0; c < cols; ++c)
		{
			numbers[r][c] = rand.nextInt(101);
		}
	}
	
	
	}

}
