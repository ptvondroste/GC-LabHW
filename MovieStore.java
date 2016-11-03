import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieStore {

	public static void main(String[] args) {
		// TODO
		System.out.println("Welcome to the Movie List Application");
		System.out.println("There are ten movies in this List");
		Scanner scan = new Scanner(System.in);
		String continues;

		ArrayList<Movie> movieCllct = new ArrayList<Movie>(10);

		movieCllct.add(new Movie("Days Of Thunder", "Drama"));
		movieCllct.add(new Movie("Star Trek", "SciFi"));
		movieCllct.add(new Movie("Jeepers Creepers", "Horror"));
		movieCllct.add(new Movie("Lethal Weapon", "Drama"));
		movieCllct.add(new Movie("Lethal Weapon II", "Drama"));
		movieCllct.add(new Movie("Beverly Hills Cop", "Drama"));
		movieCllct.add(new Movie("Toy Story", "Animated"));
		movieCllct.add(new Movie("Saw I", "Horror"));
		movieCllct.add(new Movie("Saw III", "Horror"));
		movieCllct.add(new Movie("Cars", "Animated"));

		do {
			System.out.println("What category are you interested in: Drama, SciFi, Horror or Animated");
			String category = scan.next();
			//(!(category.equals("Animated"))||!(category.equals("Drama"))||!(category.equals("SciFi"))||!(category.equals("Horror")))
			
					
			while (!(category.equals("Animated"))){
				System.out.println("inValid Entry");
				category = scan.next();
			}
			for (Movie s : movieCllct) {
				if (s.getCategory() != null && category.contains("Drama") && s.getCategory().contains("Drama")) {
					System.out.println(s.getTitle());
				} else if (s.getCategory() != null && category.contains("SciFi") && s.getCategory().contains("SciFi")) {
					System.out.println(s.getTitle());
				} else if (s.getCategory() != null && category.contains("Horror")
						&& s.getCategory().contains("Horror")) {
					System.out.println(s.getTitle());
				} else if (s.getCategory() != null && category.contains("Animated")
						&& s.getCategory().contains("Animated")) {
					System.out.println(s.getTitle());
				}

			}
			System.out.println("================================");
			System.out.println("Continue? Y/N:");
			continues = scan.next();
		} while (continues.startsWith("y"));
			if (continues.equalsIgnoreCase("N")) {
			System.out.println("GOODBYE");
			}

		scan.close();
	}
}
