import java.util.Scanner;

public class Chap8Part8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String op; 
		double number1, number2;
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		number1 = input1.nextDouble();
		
		System.out.println("Please enter the second number: ");
		number2 = input2.nextDouble();
		
		System.out.println("Please enter the operator: ");
		op = input3.nextLine();
		
		switch(op)
		{
		case "+":
			System.out.println(number1 + number2);
			break;
			
		case "-":
			System.out.println(number1 - number2);
			break;
			
		case "*":
			System.out.println(number1 * number2);
			break;
		
		case "/":
			System.out.println(number1 / number2);
			break;

		default:
			System.out.println("Invalid operator");
		}
		
	}

}
