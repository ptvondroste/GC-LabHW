import java.math.BigDecimal;
import java.util.Scanner;

public class Lab8BattingStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Player Number 1 Stats");
		// System.out.println("");
		Scanner scan = new Scanner(System.in);
		System.out.println("Baseball Batting Stats");
		System.out.println("How many at bats for player 1?");

		int player1atBat = scan.nextInt();
		int[] atBatArray1 = new int[player1atBat];
		System.out.println("Enter: 0 for strike, 1 for base hit, 2 for double, 3 for tripple, 4 for homerun");
		double batterHits = 0;
		double battingAvg;
		double slugging=0;
		double sluggingAvg;
			
		for (int j = 0; j<atBatArray1.length; j++) {
			atBatArray1[j] = scan.nextInt();
			
			if (atBatArray1[j] > 0 ) {
				batterHits++;
				slugging= slugging + atBatArray1[j]; 
				//System.out.println(batterHits);
				}
			}
		battingAvg = batterHits/atBatArray1.length;
		sluggingAvg = slugging/atBatArray1.length;
		
		BigDecimal battingAvg_P = new BigDecimal(battingAvg).setScale(3, BigDecimal.ROUND_HALF_UP);
		BigDecimal sluggingAvg_P = new BigDecimal(sluggingAvg).setScale(3, BigDecimal.ROUND_HALF_UP);
		
		System.out.println("Player 1 Batting avg:" +"\t"+ battingAvg_P);
		System.out.println("Player 1 slugging avg:" +"\t"+ sluggingAvg_P);
			
		/*for (double atBat: atBatArray1) {
				sum = sum +atBat;
		}
		double battingAverage = sum/atBatArray1.length;
		System.out.println(battingAverage);
		
			//while (i == 0 || i == 2 || i == 3 || i == 4) {
		
				
			
				//System.out.println("invalid input please enter a number 0 thru 4");
			//}
		
		
	/* System.out.println("Continue with entering at hitting results for player
	 1: y or no");
	String userInput = scan.next();
		if(userInput.equalsIgnoreCase("y")){
		
		continue;
		}
		else if(userInput.equalsIgnoreCase("n")){
		break;
		}
		System.out.println("Invlaid Entry please enter a Y or N");
		*/
	}
}