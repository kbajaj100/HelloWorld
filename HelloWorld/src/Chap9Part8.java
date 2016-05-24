import java.util.Scanner;

public class Chap9Part8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String response1, response2, response3;
		String question, message1, message2, message3;
		String answer1, answer2;
		
		answer1 = "Watson";
		answer2 = "watson";
		
		System.out.println("Let's play a guessing game. You get 3 tries");
		System.out.print("What was the name of the computer that played Jeopardy?");
		
		Scanner input1 = new Scanner(System.in);
		
		for (int i = 1; i<=3; ++i)
		{
			response1 = input1.nextLine();
			
			if (!response1.equals(answer1) && !response1.equals(answer2))  
			{
				if (i < 3)
				{
					System.out.println();
					System.out.print("Sorry, guess again: ");
					continue;
				}
				else
					System.out.println();
				System.out.print("The answer is watson");
				continue;
			}
			//else if ((!response1.equals(answer1) && !response1.equals(answer2)) && i == 3)

			System.out.println("That's right!");
			break;
			
		}
			
		
	}

}
