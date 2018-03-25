import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class Pranay {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File x = new File("Pranay.txt");
		PrintWriter output = new PrintWriter(x);
		output.println();
		output.println(212);
		output.println(45);
		output.println(52);
		output.println(57);
		output.println(90);
		output.close();

	}
}