import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String typeMovie;
    private List<Movie> movies; // Using a list to store movies in the catalog

    public Catalog(String typeMovie) {
        this.typeMovie = typeMovie;
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie getMovieByBluRayId(int bluRayId) {
        for (Movie movie : movies) {
            if (movie instanceof BluRay) {
                BluRay bluRay = (BluRay) movie;
                if (bluRay.getBluRayId() == bluRayId) {
                    return bluRay;
                }
            }
        }
        return null; // BluRay with the given ID not found 
    }

    // Method to print information about movies in the catalog
    public void printInfo() {
        System.out.println("Catalog Type: " + typeMovie);
        System.out.println("Movies in the Catalog:");

        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Movie ID: " + movie.getMovieId());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Actors: " + movie.getActors());
            System.out.println("------");
        }
    }

    public String getTypeMovie() {
        return typeMovie;
    }

    public void setTypeMovie(String typeMovie) {
        this.typeMovie = typeMovie;
    }
}