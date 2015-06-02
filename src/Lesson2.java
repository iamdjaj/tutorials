
import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// String input;
		// Hello make a program that makes sound
		// Another comment
		
		System.out.print("Hey, who the hack are you? \n");
		
		
		// First way
		// input = scanner.nextLine();
		
		// if(input.equals("I am AJ")) {
				//	System.out.print("Well, hello, AJ!");
				//} else if(input.equals("AJ")) {
				//	System.out.print("Well, hello, ");
				//	System.out.print (input);
				//	System.out.print ("!");
				//} else {
				//	System.out.print("Doesn't work");
				//}
				
		// Second way	
		// String input1 = scanner.next();
		// String input2 = scanner.next();
		// String input3 = scanner.next();
			
		// if (input3.equals("AJ")) {
			// System.out.print("Well, hello, ");
			// System.out.print(input3);
			// System.out.print("!");
		//} else if(input1.equals("AJ")) {
		//	System.out.print("Well, hello, ");
		//	System.out.print(input1);
		//	System.out.print("!");
		//} else {
			//	System.out.print("Doesn't work");
		//	}

		
		String input = scanner.nextLine();
		
		// while(!scanner.next().isEmpty()) {
			
		String[] pieces = input.split("\\s+");
		// Parse the pieces
		String piece1 = pieces[0];
		String piece2 = pieces[1];
		String piece3 = pieces[2];
		
		if (piece3.equals("AJ")) {
			System.out.print("Well, hello, ");
			System.out.print(piece3);
			System.out.print("!");
		} else if(piece1.equals("AJ")) {
			System.out.print("Well, hello, ");
			System.out.print(piece1);
			System.out.print("!");
		} else {
			System.out.print("Doesn't work");
		}
		
		// }
	}
}
