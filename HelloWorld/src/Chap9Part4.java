
public class Chap9Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double balance = 5000;
		double rate = 1.02;
		int years = 0;
		
		while (balance <=100000){
			balance = balance * rate;
			++years;
		}
		
		System.out.println(years);
		
	}

}
