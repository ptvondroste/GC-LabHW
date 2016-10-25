import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {
		/* Code calculates the area and perimeter of a rectangle room
		 * Based on user inputs
		 */
		
		
		String eval = "";
			do{
		//User input of length of room in mm
		Scanner Room_Length = new Scanner(System.in);
		System.out.println("Enter Room Length in mm: ");
		String inputRoom_Length = Room_Length.next();
		
		//User input of width of room in mm
		Scanner Room_Width = new Scanner(System.in);
		System.out.println("Enter Room width in mm: ");
		String inputRoom_Width = Room_Width.next();
		
		//Calculations of Area and perimeter	
		double Length = Double.parseDouble(inputRoom_Length);
		double Width = Double.parseDouble(inputRoom_Width);
		double Area = Length*Width;
		double Perimeter = 2*Length + 2*Width;
				 			
		//Outputs
		System.out.println("The area is:" + Area);
		System.out.println("The Parimeter is:" + Perimeter);
		
		//User input to continue with room measurements
		//Note need to add additional validation to limit input to Y & N only
		//any letter will advance except N
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Continue with next room (Y or N)");
		eval = inputScanner.next();
						
		} while(!eval.equals("N"));
				

	}

}
