import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Name of data file?");
		String fileInput = input.nextLine();
		String fileName = fileInput +".txt";
		File x = new File(fileName);
		
		try {
		PrintWriter output = new PrintWriter(x);
		output.println("");
		output.println("321");
		output.println(5);
		output.close();
		}catch(IOException ex) {
			System.out.println("file Not Found");
		}
		
		Scanner y = new Scanner(x);
		int sum = 0;
		while(y.hasNext()) {
			sum+=y.nextInt();
		}
		System.out.println(sum);
		y.close();
		input.close();
		
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String name = input.nextLine();
		File bob = new File(name);
		Scanner input2 = new Scanner(name);
		int sum = 0;
		while (input2.hasNext())
		{
		sum += input2.nextInt();
		}
		System.out.println("Sum = " + sum);
		*/
		
		
		
		
		
		
		
	}

}
