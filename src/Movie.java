
public class Movie {

	private String movieName;
	private String movieGenre;

public Movie(String movieName,String movieGenre)
{
	this.movieName=movieName;
	this.movieGenre=movieGenre;
}
public Movie()
{
	
}
public void setMovieName(String movieName)
{
	this.movieName=movieName;
}
public void setMovieGenre(String movieGenre)
{
	this.movieGenre=movieGenre;
}
public String getMovieName( )
{
	return movieName;
}
public String getMovieGenre( )
{
	return movieGenre;
}
}