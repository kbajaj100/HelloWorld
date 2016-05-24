import java.util.Random;

//In this exercise, you can pass arrays to methods, 
//populate the array with random values and then 
//display them and calculate the total of the array
public class Chapt15Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int size = 100;
		int[] numbers = new int[size];
		buildArray(numbers, size);
		displayArr(numbers, size);
		System.out.println(sumArray(numbers, size));
		
	}

	static void buildArray(int[] arr, int size)
	{
		Random rand = new Random(System.currentTimeMillis());
		for(int i = 0; i < size; ++i)
		{
			arr[i] = rand.nextInt(101);
		}
	}
	
	static void displayArr(int[] arr, int size)
	{
		for(int i = 0; i < size; ++i)
		{
			System.out.print(arr[i] + " ");
			if ((i+1)%10 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	static int sumArray(int[] arr, int size)
	{
		int total = 0;
		for(int i = 0; i < size; ++i)
		{
			total += arr[i];
		}
		return total;
	}
}
