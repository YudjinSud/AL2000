package com.al2000.Core;

public abstract class Movie {
    private String title;
    private String resume;
    private int movieId;
    private String movieType;
    private String director;
    private String actors;

    public Movie(String title, String resume, int movieId, String movieType, String director, String actors) {
        this.title = title;
        this.resume = resume;
        this.movieId = movieId;
        this.movieType = movieType;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String toString () {
	return "";
    }
}
