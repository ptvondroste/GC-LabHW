import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO
		
		Scanner scan = new Scanner(System.in);
		String yesInput;
		do {
		System.out.println("Please Enter a radius of a circle");
			
			double R_Input = scan.nextDouble();
			while (R_Input <= 0) {
				System.out.println("inValid Entry");
				R_Input = scan.nextDouble();
			}

			CircleCalcMeth circle1 = new CircleCalcMeth(R_Input);

			System.out.println("Circumference is:" + circle1.getCircumference());
			System.out.println("Area is:" + circle1.getArea());
			System.out.println("==========================================================");
			System.out.println("Formatted Circumference is:" + circle1.getFormattedCircumference());
			System.out.println("Formatted Area is:" + circle1.getFormattedArea());

			System.out.println("Would you like to Continue: Y or N");
			yesInput = scan.next();
			
		}while (yesInput.startsWith("y"));
			if (yesInput.equalsIgnoreCase("N")) {
		System.out.println("GOODBYE");
			}

		scan.close();
	}

}
