import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MovieApp {

	public static Map<String,String> genreCodes = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movieList = new ArrayList<>(); 		
		for(int i =1 ;i<101;i++)
		{
			movieList.add(MovieIO.getMovie(i));		
		}
//Movie movie1 = new Movie("Citizen Kane","drama");
//Movie movie2 = new Movie("Star Wars","scifi");
//Movie movie3 = new Movie("Singin' In The Rain","musical");
//Movie movie4 = new Movie("Dr. Strangelove","drama");
//Movie movie5 = new Movie("E.T. The extra-terrestrial", "scifi");
//Movie movie6 = new Movie("Annie Hall", "comedy");
//Movie movie7 = new Movie("King Kong", "horror");
//Movie movie8 = new Movie("Snow White And The Seven Dwarfs", "animated");
//Movie movie9 = new Movie("Jaws", "horror");
//Movie movie10 = new Movie("Fantasia", "animated");;
//
//movieList.add(movie1);
//movieList.add(movie2);
//movieList.add(movie3);
//movieList.add(movie4);
//movieList.add(movie5);
//movieList.add(movie6);
//movieList.add(movie7);
//movieList.add(movie8);
//movieList.add(movie9);
//movieList.add(movie10);


Scanner scnr = new Scanner(System.in);
System.out.println("Welcome to the MovieList Application!");
System.out.println("There are 10 movies in the list.");

setGenreCodes(genreCodes);
displayGenres(genreCodes);
do {
	List<String> selectedList =  new ArrayList<>();
	String movieCategory = Validator.getString(scnr,"What Category are you interested?(Enter Codes)");
	movieCategory = genreCodes.get(movieCategory);
	for(Movie movie: movieList)
	{
		if(movie.getMovieGenre().equalsIgnoreCase(movieCategory))
			//System.out.println(movie.getMovieName());
			selectedList.add(movie.getMovieName());
	}
	Collections.sort(selectedList);
	for(String selectedMovie:selectedList)
	{
	System.out.println(selectedMovie);
	}
	if(selectedList.isEmpty())
		System.out.println("Invalid Code.");
}while(Validator.getYesNo(scnr,"Continue(y/n): "));

System.out.println("Thank you!");
}
	
	public static void setGenreCodes(Map<String,String> genreCodes)
	{
		genreCodes.put("001", "comedy");
		genreCodes.put("002", "horror");
		genreCodes.put("003", "animated");
		genreCodes.put("004", "scifi");
		genreCodes.put("005", "drama");
		genreCodes.put("006", "musical");
		
		
		
	}
	public static void displayGenres(Map<String,String> genreCodes)
	{
		System.out.println("Code" +" " + "Genre");
		for(Map.Entry<String,String> entry:genreCodes.entrySet())
		{
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
		
	}

}
