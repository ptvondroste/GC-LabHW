import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// team Clara, Jacob, Patrick
		// objective: take the square and cube of user input and display in
		// console
		// prompt for 1st number
		// prompt for continuation
		// have code loop back again for calculation unless user says no to continuation 
		// Use of scanner method
		// use of Loops while and for

		Scanner userInput = new Scanner(System.in);

		String answer = "y";

		//main loop for running sequence of code
		while (answer.equalsIgnoreCase("y")) {
			
			System.out.println("Enter any number");
			int userInt = userInput.nextInt();

			System.out.println("Number" + "\t" + "Squared Number" + "\t" + "Cubed Number");
			System.out.println("------" + "\t" + "--------------" + "\t" + "------------");
			
			//Nested loop for calculating user input
			for (int value = 1; value <= userInt; value++) {

				System.out.println(value + "\t"+"\t" + value * value + "\t"+"\t" + value * value * value);

			}

			System.out.println("Would you like to continue Y or N");
			answer = userInput.next();

			if (answer.toLowerCase().startsWith("n")) {
				System.out.println("Progam End");
			}

		}
		userInput.close();
	}

}
