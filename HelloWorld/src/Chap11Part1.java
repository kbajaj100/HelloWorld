import java.util.ArrayList;
import java.util.Random;

public class Chap11Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random(System.currentTimeMillis());
		
		int number;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < 10; ++i){
			numbers.add(rand.nextInt(101));
			System.out.println(numbers.get(i));
		}
		/*
		number = rand.nextInt(101); // allows for a random number from 0-100
		
		System.out.println(number);*/
		
	}

}
