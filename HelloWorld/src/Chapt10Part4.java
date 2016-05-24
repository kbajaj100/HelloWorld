import java.util.Scanner;

public class Chapt10Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input1 = new Scanner(System.in);
		
		int num;
		
		System.out.println("Please enter a number: ");
		num = input1.nextInt();
		
		if (isEven(num))
			System.out.println("The number: " + num + " is even");
		else 
			System.out.println("The number: " + num + " is odd");
		
	}

	
	static boolean isEven(int number)
	{
		if (number%2 == 0){
			return true;
		}
		else return false;
	}
}
