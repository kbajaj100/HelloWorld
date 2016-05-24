import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Chap11Part7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random(System.currentTimeMillis());
		int position = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		/*
		for(int i = 0; i<100; ++i){
			numbers.add(rand.nextInt(101));
		}
		
		if(numbers.indexOf(100) >= 0)
		{
			position = numbers.indexOf(100);
			System.out.println("100 was found at position: " + position);
		}
		
		if(numbers.contains(100))
			System.out.println("100 was found at position: " + position);
		else
			System.out.println("100 was not found"); // at position: " + position);
		
		// Looking for the minimum value in an array
		// Assign the first value, i.e. position 0 as the min and then start comparing
		int min = 0;
		
		for(int i = 1; i < numbers.size(); ++i)
		{
			if(numbers.get(i) < numbers.get(min)) //gets the value at position i and min
				min = i;
		}
		
		System.out.println("The lowest value in the array is: " + numbers.get(min) + " and the position of this value is: " + min);
		*/
		
		for(int i = 0; i<10; ++i){
			numbers.add(rand.nextInt(101));
		}		
		
		display(numbers);
		
		Collections.sort(numbers); //in built Java class for sorting the values in an array
		display(numbers);
	}

	static void display(ArrayList arr)
	{
		for(int i = 0; i < arr.size(); ++i)
		{
			System.out.println(arr.get(i) + " ");
		}
		System.out.println();
	}
	
}
