package com.al2000.Core;


public class BluRay extends Movie {
    private int numberOfRent;
    private int bluRayId;
    private boolean available;

    public BluRay(String title, String resume, int movieId, String movieType, String director, String actors,
                  int numberOfRent, int bluRayId) {
        super(title, resume, movieId, movieType, director, actors);
        this.numberOfRent = numberOfRent;
        this.bluRayId = bluRayId;
        this.available = available;

    }

    public int getNumberOfRent() {
        return numberOfRent;
    }

    public void setNumberOfRent(int numberOfRent) {
        this.numberOfRent = numberOfRent;
    }

    // Getter and Setter for bluRayId
    public int getBluRayId() {
        return bluRayId;
    }

    public void setBluRayId(int bluRayId) {
        this.bluRayId = bluRayId;
    }

    public boolean isAvailable() {
        return available;
    }
    
    public void toggleAvailability() {
        this.available = !this.available;
    }

}