import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Chap17Part3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String fileName = "grades.txt";
		Scanner inFile = new Scanner(new FileReader(fileName));
		
		int grade;
		while(inFile.hasNextLine())
		{
			grade = Integer.parseInt(inFile.nextLine());
			System.out.println(grade);
		}
	}

}
