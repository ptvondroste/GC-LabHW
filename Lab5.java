import java.util.Scanner;

public class Lab5 {
	// Code Structure:
	// Prompt for choice of type of Die per pair
	// List available options for die pair
	// Option 1
	// Convert selected option back to
	// ---void look into using options configured into an array
	// run method for generating random isolated numbers
	// run loop condition to check for special roll pair

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would You like to play Dice yes or no");
		String userInput = scan.next();

		if (userInput.equals("yes")) {

			System.out.println("Choose Available die Pairs");
			System.out.println("Enter 3 for 3 sided die");
			System.out.println("Enter 6 for 6 sided die");
			System.out.println("Enter 9 for 9 sided die");

		} else {
			System.out.println("Game not Started");
		}
		
		int userInput_2 = scan.nextInt();
		int value_1 = 3;
		int value_2 = 6;
		int value_3 = 9;
		int value_4 = 2;
		int userInput_3= scan.nextInt();
		while (value_1 != userInput_2||value_2 != userInput_2||value_3 != userInput_2||userInput_3 == value_4) {
			
			//userInput_2 = scan.nextInt();
			System.out.println("Invalid Input Please enter valid #");
			

			
			
				int roll_1 = rollDie(1, userInput_2);

				int roll_2 = rollDie(1, userInput_2);

				System.out.println("Die 1 Roll value:" +"\t" + roll_1);
				System.out.println("Die 2 Roll value:" + "\t" + roll_2);
				
				System.out.println("Would you like to play again: 1 for yes or 2 for no");
				userInput_3 = scan.nextInt();
				
			//} while (userInput_3.contains("y"));

		}
	}

	// Modified version of java Math.random method
	// (int) casts onto the double method and the +1 is to set the min value
	// from
	// the random generator number to at least a value of 1 or when it returns a
	// 0

	public static int rollDie(int min, int max) {
		min = 0;
		int range = (max - min);
		return (int) (Math.random() * range) + 1;
	}

}
