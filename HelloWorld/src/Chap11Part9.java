import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Chap11Part9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: " );
		
		String myString = input.nextLine();
		
		int Stringlen = myString.length();
		
		char foo;
		
		ArrayList<String> pal_test = new ArrayList<String>(); 

		for(int i = 0; i < Stringlen; ++i)
		{
			foo = myString.charAt(i);
			pal_test.add(foo + ""); // pal_test is an array of Strings so a single character in a position is not allowed. Concatenation with an empty string is necessary
		}
		
		for (int i = 0; i < Stringlen; ++i)
		{
			System.out.println(pal_test.get(i));
		}
		
		int check_value;
		check_value = pal_check(pal_test);
		
		if (check_value == 0)
			System.out.println("This string is a palindrome");
		else System.out.println("This string is NOT a palindrome");
	}

	
	static int pal_check(ArrayList<String> pal)
	{
		int inc, dec, tally;
		int count_max;
		
		inc = 0;
		dec = pal.size();
		//System.out.println(pal.size());
		tally = 0;
		
		if (dec % 2 == 0)
			count_max = dec/2;
		else count_max = ((dec - 1)/2);
		
		System.out.println("count_max: " + count_max);
		
		for(int count = 1; count <= count_max; ++count)
		{
			System.out.println("pal.get(inc): " + pal.get(inc));
			System.out.println("pal.get(dec-1): " + pal.get(dec-1));
			if(pal.get(inc).equals(pal.get(dec-1))) // for string comparison have to use equals and not ==
			{
				++tally;
				++inc;
				--dec;
			}
			else break;
		}

		System.out.println("tally: " + tally);
		
		if (tally == count_max)
			return 0;
		else return 1;
	}
}
