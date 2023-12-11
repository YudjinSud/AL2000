package com.al2000.Core;
import com.al2000.Core.*;

public class AL2000 {
    private int nbRentals;
    private float sumRentedPrice;
    private float sumDurationRent;
    private User currentUser;
    private Subscriber currentSub;

    public AL2000() {
        this.nbRentals = 0;
        this.sumRentedPrice = 0.0f;
        this.sumDurationRent = 0.0f;
        this.currentUser = null;
        this.currentSub = null;
    }

    public float avgCostOfRent() {
        if (nbRentals > 0) {
            return sumRentedPrice / nbRentals;
        } else {
            return 0.0f; // Avoid division by zero
        }
    }

    public int availableBluRays() {
        // Implement logic 
        return 0;
    }

    public int availableMoviesCloud() {
        // Implement logic 
        return 0; 
    }

    public int availableCyberVideo() {
        // Implement logic
        return 0; 
    }

    public float avgDurationRent() {
        if (nbRentals > 0) {
            return sumDurationRent / nbRentals;
        } else {
            return 0.0f; 
        }
    }

    public Movie mostRented() {
        // Implement logic
        return null; 
    }

    public void askForMovie(Movie catalog) {
        // Implement logic 
    }

    // Getter and Setter methods 

    public int getNbRentals() {
        return nbRentals;
    }

    public void setNbRentals(int nbRentals) {
        this.nbRentals = nbRentals;
    }

    public float getSumRentedPrice() {
        return sumRentedPrice;
    }

    public void setSumRentedPrice(float sumRentedPrice) {
        this.sumRentedPrice = sumRentedPrice;
    }

    public float getSumDurationRent() {
        return sumDurationRent;
    }

    public void setSumDurationRent(float sumDurationRent) {
        this.sumDurationRent = sumDurationRent;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public Subscriber getCurrentSub() {
        return currentSub;
    }

    public void setCurrentSub(Subscriber currentSub) {
        this.currentSub = currentSub;
    }
}
