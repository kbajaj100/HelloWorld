import java.util.Scanner;

public class Chap8Part1 {

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
		response1 = input1.nextLine();
		
		if (response1.equals(answer1) || response1.equals(answer2)) 
		{
			System.out.println("That's right!");
		}
		else 
		{
			System.out.println();
			System.out.print("Sorry, guess again: ");
			response2 = input1.nextLine();
			if (response2.equals(answer1) || response2.equals(answer2))
			{
				System.out.println("That's right!");
			}
			else
			{
				System.out.println();
				System.out.print("That's still not right, try again: ");
				response3 = input1.nextLine();
				//System.out.println((response3 == "Watson" || response3 == "watson"));
				if (response3.equals(answer1) || response3.equals(answer2))
				{
					System.out.println("You finally got it!");
				}
				System.out.println(response3);
			}
		}
	}

}
