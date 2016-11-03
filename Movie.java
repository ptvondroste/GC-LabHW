
public class Movie {
private	String Title;
private String Category;


public Movie(String title, String category) {
	Title = title;
	Category = category;
	

	}
public String getTitle() {
	return Title;
}
public String getCategory() {
	return Category;
}
@Override
public String toString() {
	return  Title + "/" + Category;
}
public boolean equalsIgnoreCase(String string) {
	// TODO Auto-generated method stub
	
	return false;
}


}



