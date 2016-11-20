import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Lab10aagain {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String url = "jdbc:mysql://127.0.0.1:3306/movielist";// name of database
		String username = "root";
		String password = "cummins16";
		String query = "Select * from `movie list shorttxt`";// name of table

		String query1[] = { "Select * from `movie list shorttxt` where Genre = 'action';" };
		String query2[] = { "Select * from `movie list shorttxt` where Genre = 'animated';" };
		String query3[] = { "Select * from `movie list shorttxt` where Genre = 'comedy';" };
		String query4[] = { "Select * from `movie list shorttxt` where Genre = 'drama';" };
		String query5[] = { "Select * from `movie list shorttxt` where Genre = 'fantasy';" };
		String query6[] = { "Select * from `movie list shorttxt` where Genre = 'thriller';" };
		String query7[] = { "Select * from `movie list shorttxt` where Genre = 'Scifi';" };

		Class.forName("com.mysql.jdbc.Driver");//

		Connection con = DriverManager.getConnection(url, username, password);

		// Statement st = con.createStatement();
		Statement st = con.createStatement();

		// rs.next();// sets point to next line in table

		// String Title = rs.getString("Title");

		// String Genre = rs.getString("Genre");
		// System.out.println(Title + "\t" + Genre);

		System.out.println(
				"Enter a number for Genre:\t 1. Action\t2.Animated\t3.Comedy\t4.Drama\t5.Fantasy\t6.SciFi\t7.Thriller");
		String genre = scanner.next();
		String title = "";
		switch (genre) {
		case "Action":
			for (String q : query1) {
				ResultSet rs = st.executeQuery(q);
				System.out.println("Available Action Movies are");
				while (rs.next()) {
					String action1 = rs.getString("Title");
					System.out.print(" " + action1 + "\n");
				}
			}
			break;
		case "Animated":
			for (String q : query2) {
				ResultSet rs = st.executeQuery(q);
				System.out.println("Available Animated Movies are");
				while (rs.next()) {
					String Animated1 = rs.getString("Title");
					System.out.print(" " + Animated1 + "\n");
				}
			}
			break;
		case "Comedy":
			for (String q : query3) {
				ResultSet rs = st.executeQuery(q);
				System.out.println("Available Comedy Movies are");
				while (rs.next()) {
					String comedy1 = rs.getString("Title");
					System.out.print(" " + comedy1 + "\n");
				}
			}
			break;
		case "Drama":
			for (String q : query4) {
				ResultSet rs = st.executeQuery(q);
				System.out.println("Available Drama Movies are:");
				while (rs.next()) {
					String drama1 = rs.getString("Title");
					System.out.print(" " + drama1 + "\n");
				}
			}
			break;
		case "Fantasy":
			for (String q : query5) {
				ResultSet rs = st.executeQuery(q);
				System.out.println("Available Fantasy Movies are");
				while (rs.next()) {
					String fantasy1 = rs.getString("Title");
					System.out.print(" " + fantasy1 + "\n");
				}
			}
			break;
		case "SciFi":
			for (String q : query6) {
				ResultSet rs = st.executeQuery(q);
				System.out.println("Available SciFi Movies are");
				while (rs.next()) {
					String scifi1 = rs.getString("Title");
					System.out.print(" " + scifi1 + "\n");
				}
			}
			break;
		case "Thriller":
			for (String q : query7) {
				ResultSet rs = st.executeQuery(q);
				System.out.println("Available Thriller Movies are");
				while (rs.next()) {
					String thriller1 = rs.getString("Title");
					System.out.print(" " + thriller1 + "\n");
				}
			}
			break;

		}

		st.close();
		con.close();

	}

}
