package com.al2000.Data.data;

public class Movies {
    
    private int movieId;
    private String title;
    private int nbRented;
    private boolean availableCyberVideo;
    private boolean availableBluRay;
    private boolean availableQRCode;

    public Movies() {
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
    public int getNbRented() {
        return this.nbRented;
    }
    public void setNbRented(int nbRented) {
        this.nbRented = nbRented;
    }
    public boolean getAvailableCyberVideo() {
        return this.availableCyberVideo;
    }
    public void setAvailableCyberVideo(boolean availableCyberVideo) {
        this.availableCyberVideo = availableCyberVideo;
    }
    public boolean getAvailableBluRay() {
        return this.availableBluRay;
    }
    public void setAvailableBluRay(boolean availableBluRay) {
        this.availableBluRay = availableBluRay;
    }
    public boolean getAvailableQRCode() {
        return this.availableQRCode;
    }
    public void setAvailableQRCode(boolean availableQRCode) {
        this.availableQRCode = availableQRCode;
    }


    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return "Movies [movieId=" + movieId + ", title=" + title + ", nbRented=" + nbRented + 
        ", availableCyberVideo=" + availableCyberVideo + 
        ", availableBluRay=" + availableBluRay +
        ", availableQRCode=" + availableQRCode + "]";
    }
    
}
