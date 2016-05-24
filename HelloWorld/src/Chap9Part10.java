import java.util.Scanner;

public class Chap9Part10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vowel_count = 0;
		char char_position;
		
		String myString = "The blind horse jumps over the moon at midnight and then goes to sleep.";
		
		for (int i = 0; i < myString.length(); ++i)
		{
			char_position = myString.charAt(i);
			
			if ((char_position == 'a') || (char_position == 'e') || (char_position == 'i') || (char_position == 'o') || (char_position == 'u')) 
			{
				++vowel_count;
			}
		}
		
		System.out.println("The number of vowels in the sentence is: " + vowel_count);
	}

}
