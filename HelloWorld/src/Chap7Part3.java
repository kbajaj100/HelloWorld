import java.util.Scanner;

public class Chap7Part3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*Scanner input = new Scanner(System.in);

		int number;
		
		number = input.nextInt();

		System.out.println("the number is: " + number);
		
		double number1, number2, sum;
		
		System.out.println("Enter the first number: ");
		number1 = input.nextDouble();

		System.out.println("Enter the second number: ");
		number2 = input.nextDouble();
		
		sum = number1 + number2;
		
		System.out.println("The sum is: " + sum);*/

		Scanner input1 = new Scanner(System.in);

		String name;
		/*
		System.out.println("Enter name: ");
		name = input1.next();
		System.out.println("The name you entered is :" + name);
		*/
		System.out.println("Enter name: ");
		name = input1.nextLine();
		System.out.println("The name you entered is :" + name);
	}

}
