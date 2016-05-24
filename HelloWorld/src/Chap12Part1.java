
public class Chap12Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time theTime = new Time();

		theTime.setTime(23, 50, 23);
		
		String myTime;
		
		myTime = theTime.toString();
		
		System.out.println(myTime);
		
/*		thetime.hours = 12;
		thetime.minutes = 30;
		thetime.seconds = 45;
		
		theTime.increment(40);
		myTime = theTime.toString();
		System.out.println(myTime);*/

		Time theTime1 = new Time();

		theTime1.setTime(23, 50, 23);
		
		System.out.println(theTime.equals(theTime1));
		
	}


	
}
