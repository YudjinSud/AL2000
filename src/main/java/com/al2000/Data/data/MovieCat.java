package com.al2000.Data.data;

public class MovieCat {

    private int movieId;
    private String movieCat; 

    public MovieCat(){
    }

    public int getMovieId() {
        return this.movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getMovieCat() {
        return this.movieCat;
    }
    public void setMovieCat(String movieCat) {
        this.movieCat = movieCat;
    }

    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return "MovieCat [movieId=" + movieId + ", movieCat=" + movieCat + "]";
    }
}
