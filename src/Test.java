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
	        Scanner input4 = new Scanner(doc);
	        File y = new File("bob");
	        FileOutputStream outputStream = new FileOutputStream(y);
	        PrintWriter output = new PrintWriter(outputStream);

	        int count = 0;	       
	        while (input.hasNext()) {
	           count+=input.nextInt();	
	        }
	        while(input4.hasNext()) 
	        	if(input4.nextInt()%2==0) {
	        		System.out.println(input4.nextInt());
	        	}
	        
	        output.close();
	        System.out.println("Sum: " + count);
	        
	        /*
	         * Scanner input2 = new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String x = input2.nextLine();
		File doc = new File(x);
		Scanner input = new Scanner(doc);
		Scanner input3 = new Scanner(doc);
		File y = new File("bob");
		FileOutputStream outputStream = new FileOutputStream(y);
		PrintWriter output = new PrintWriter(outputStream);
		int count = 0;
		while (input.hasNext()) {
			count += input.nextInt();
		}
		while(input3.hasNext()) System.out.println(input3.nextLine());
		output.close();
		System.out.println("Sum: " + count);
	         */
	    }
	}