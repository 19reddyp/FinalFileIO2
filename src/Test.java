import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {

		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String x = input2.nextLine();
		File doc = new File(x);
		Scanner input = new Scanner(doc);
		File y = new File("bob");
		FileOutputStream outputStream = new FileOutputStream(y);
		PrintWriter output = new PrintWriter(outputStream);

		int count = 0;
		int evenCount = 0;
		while (input.hasNext()) {
			if (input.nextInt() % 2 == 0) {
				evenCount++;
			}
		}
		System.out.println(evenCount);
		/*
		 * while (input.hasNext()) { count+=input.nextInt(); } output.close();
		 * System.out.println("Sum: " + count); while(input.hasNext()) {
		 * 
		 * }
		 */
	}
}