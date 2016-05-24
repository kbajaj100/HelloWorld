
public class NameTest {

		public static void main(String[] args)
		{
			// instantiation
			Name myName = new Name("Michael", "Mason", "Mcmillan");
			Name yourName = new Name("Raymond", "Williams");
			Name someName = new Name();
			/*Name aName = new Name("Durr");
			Name someName = new Name();
			
			System.out.println("myName: " + myName.toString());
			System.out.println("yrName: " + yourName.toString());
			System.out.println("somename: " + someName);*/
			
			System.out.println("myName: " + myName.getFirst());
			yourName.setLast("Brown");
			System.out.println("yourname: " + yourName.toString());
			someName.setFirst("John"); //, "Quincy","Adams");
			System.out.println("somename: " + someName.toString());
		}
}
