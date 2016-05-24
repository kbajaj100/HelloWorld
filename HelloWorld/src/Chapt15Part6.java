import java.util.Random;

public class Chapt15Part6 {

	public static void main(String[] args) {
		
		final int size = 101;
		int[] arr1 = new int[size];
		
		Random rand = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < size; ++i)
		{
			arr1[i] = rand.nextInt(101);
		}
		
		int[] distribution = new int[size];
	
		int number = 0;
		
		for(int i = 0; i < size; ++i)
		{
			distribution[i] = 0;
		}
		
		for(int i = 0; i < size; ++i)
		{
			number = arr1[i];
			distribution[number] = distribution[number] + 1; 
		}
		
		for(int i = 0; i < size; ++i)
		{
			System.out.println("Position: " + i + "  " + distribution[i]); 
		}
	}
	
}
