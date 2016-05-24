

public class Chap12Part6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc myCalc = new Calc(100.0);
		myCalc.setnumber(600);
		
		System.out.println(myCalc.show());
		
		double number;
		
		myCalc.add(23);
		number = myCalc.show();
		System.out.println(number);
		
		myCalc.subtract(23);
		number = myCalc.show();
		System.out.println(number);
		
		myCalc.mult(23);
		number = myCalc.show();
		System.out.println(number);
		
		myCalc.div(23);
		number = myCalc.show();
		System.out.println(number);
	}

}
