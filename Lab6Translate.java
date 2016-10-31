import java.util.Scanner;

public class Lab6Translate {

	public static void main(String[] args) {
		// Prompt user for input
		// convert to lower case
		// 1.find length of input/ string
		// 2.
		// for loop
		// nested if loop

		// translate user input into pigLatin
		// Prompt for next variable

		Scanner input = new Scanner(System.in);
		System.out.println("English to PigLatin Translator Beta");
		System.out.println("Enter any word in English");
		String message = input.nextLine();

		StringBuilder transLated = new StringBuilder();
		message.toLowerCase();

		if (message.charAt(0) == 'a' || message.charAt(0) == 'e' || message.charAt(0) == 'i' || message.charAt(0) == 'o'
				|| message.charAt(0) == 'u') {

			message.substring(0);

			// System.out.println(message); used for testing

			transLated.append("way");
			String pigLatinMessage;
			pigLatinMessage = message + transLated;

			System.out.println(pigLatinMessage);
		} else {

			int index1 = message.indexOf("a");
			int index2 = message.indexOf("e");
			int index3 = message.indexOf("i");
			int index4 = message.indexOf("o");
			int index5 = message.indexOf("u");
			
			int[] indexGroup = { index1, index2, index3, index4, index5 };
			int smallestIndex = Integer.MAX_VALUE;
				for (int i = 0; i < indexGroup.length; i++) {
				if (smallestIndex > indexGroup[i] && smallestIndex!= -1) {
					smallestIndex = indexGroup[i];
					}
				}
			//System.out.println(smallestIndex);

			String prefix = message.substring(0, smallestIndex);
			String midSection = message.substring(smallestIndex);

			String subTransLated = midSection + prefix + "ay";

			System.out.println(subTransLated);
		}

	}
}
	
	

