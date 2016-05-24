import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class Chap17Part2 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		String fileName = "grades.txt";
		
		PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
		outFile.println(85);
		outFile.println(77);
		outFile.close();
	}

}
