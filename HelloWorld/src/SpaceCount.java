
public class SpaceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "The little horse jumps over the moon"; // and then goes to sleep in a comfortable bed.";
		
		char mychar;
		int space =0;
		
		for(int i = 0; i < myString.length(); ++i)
		{
			mychar = myString.charAt(i);
			System.out.println(mychar);
			//if (Character.toString(mychar) == " ") // this is returning 0
			if(Character.isWhitespace(mychar))
			{	
				++space;
			}
		}
		
		System.out.println(space);
	}

}