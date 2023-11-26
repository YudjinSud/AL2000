package com.al2000.Data.data;

import java.util.ArrayList;

public class Movie {
    
    private int movieId;
    private String title;
    private boolean availableQRCode;
    private ArrayList<String> movieCat;
    private ArrayList<String> actors;
    private ArrayList<String> directors;

    public Movie() {
    }

    public Movie(int movieId,String title,boolean availableQRCode,ArrayList<String> movieCat,ArrayList<String> actors,ArrayList<String> directors) {
        this.movieId = movieId;
        this.title = title;
        this.availableQRCode = availableQRCode;
        this.movieCat = movieCat;
        this.actors = actors;
        this.directors = directors;
    }
    public int getMovieId() {
        return this.movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean getAvailableQRCode() {
        return this.availableQRCode;
    }
    public void setAvailableQRCode(boolean availableQRCode) {
        this.availableQRCode = availableQRCode;
    }
    public ArrayList<String> getMovieCat(){ return this.movieCat; }
    public void setMovieCat(ArrayList<String> movieCat){ this.movieCat = movieCat; }
    public ArrayList<String> getActors(){ return this.actors; }
    public void setActors(ArrayList<String> actors){ this.actors = actors; }
    public ArrayList<String> getDirectors(){ return this.directors; }
    public void setDirectors(ArrayList<String> directors){ this.directors = directors; }

    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return "Movies [movieId=" + movieId + ", title=" + title + 
        ", availableQRCode=" + availableQRCode +
        ", movieCat=" + movieCat +
        ", actors=" + actors +
        ", directors=" + directors + "]";
    }
    
}
