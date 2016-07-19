
import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//prompt
		
		System.out.println("Welcome to the Letter Grade Converter!");
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
		
		System.out.println("Enter a numerical grade: ");
		float grade = input.nextFloat();
		
		if (grade >=88)
			System.out.println("Letter Grade: A");
		else if (grade >=80)
			System.out.println("Letter Grade: B");
			
		else if (grade >=67)
			 System.out.println("Letter Grade: C");
		
		else if (grade >=60)
			 System.out.println("Letter Grade: D");
		
		else
			System.out.println("Letter Grade: F");		
		
		System.out.println("Continue? (y/n):");
		choice = input.nextLine();
		choice = input.nextLine();//garbage
		
		}
						
	}
	
}


