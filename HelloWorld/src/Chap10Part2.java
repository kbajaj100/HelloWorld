import java.util.Scanner;

public class Chap10Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		double temperature;
		int convert;
		
		System.out.println("Please enter the temperature: ");
		temperature = input1.nextDouble();
		
		System.out.println("Please enter 1 to convert to Celcius or enter 2 to convert to Fahrenheit: ");
		convert = input2.nextInt();
		
		if (convert == 1)
		{
			System.out.println("The temperature in Celcius is: " + ftoc(temperature));
		}
		else 
		{
			System.out.println("The temperature in Fahrenheit is: " + ctof(temperature));
		}
	}
	

	static double ctof(double celcius)
	{
		return (celcius * 1.8) + 32;
	}
	
	static double ftoc(double fahrenheit)
	{
		return (fahrenheit-32)/1.8;
	}
	
	
}
