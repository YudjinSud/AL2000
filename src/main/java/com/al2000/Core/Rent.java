package com.al2000.Core;

import com.al2000.Core.*;
import java.util.Random;

public class Rent {
    private int userId;
    private int bluRayId;
    private int hourRental;
    private boolean ifSubscribed;


    public Rent(int userId, int bluRayId, int hourRental) {
        this.userId = userId;
        this.bluRayId = bluRayId;
        this.hourRental = hourRental;
        this.ifSubscribed = true;
    }

    public float getForfait() {
        float basePrice = 5.f;  // Default price for non-subscribed users
        float discountedPrice = 4.f;  // Price for subscribed users
    
        float actualPrice = this.ifSubscribed ? discountedPrice : basePrice;
        return actualPrice;
    }

    public void rentBluRay(Movie catalog, Subscriber subscriber) {

        float actualPrice = this.getForfait();

        // Check if the BluRay with the given ID exists in the catalog
        BluRay bluRay = null;
        if (bluRay == null) {
            System.out.println("No BluRay found with ID: " + bluRayId);
            return; 
        }

        if (this.ifSubscribed) {
            float solde = subscriber.getSolde();

            if (solde >= actualPrice) {
                this.rentMovie(bluRay, bluRayId);
                System.out.println("BluRay with ID " + bluRayId + " rented successfully at a discounted price.");
                // Deduct the actual price from the solde
                subscriber.setSolde(solde - actualPrice);
            } else {
                System.out.println("Insufficient solde to rent BluRay with ID " + bluRayId);
            }
        } else {
            // If the user is not subscribed, rent the BluRay at the regular price
            this.rentMovie(bluRay, bluRayId);
            System.out.println("BluRay with ID " + bluRayId + " rented successfully.");
        }
    }

    public void returnBluRay(BluRay bluRay, int bluRayId) {
        if (bluRay == null) {
            System.out.println("Invalid BluRay object. Rental failed.");
            return;
        }

        if (bluRay.isAvailable() == false) {
            bluRay.toggleAvailability();
            System.out.println("BluRay with ID " + bluRayId + " returned successfully.");
        } else {
            System.out.println("BluRay with ID " + bluRayId + " can't be retourned.");
        }
    }

    public void rentQRCode(Movie catalog) {

        if (this.ifSubscribed) {
            float solde = 0.f; // subscriber.getSolde();
	    float actualPrice = 0.f;

            if (solde >= actualPrice) {
                Random random = new Random();
                int QRcodeId = random.nextInt(1000000);
                System.out.println("Movie  " + catalog.toString() + " rented successfully at a discounted price.");
                // Deduct the actual price from the solde
                // this.subscriber.setSolde(solde - actualPrice);
            } else {
                System.out.println("Insufficient solde to rent  " + catalog.toString());
            }
        } else {
            // If the user is not subscribed, rent the BluRay at the regular price
            Random random = new Random();
            int QRcodeId = random.nextInt(1000000);
            System.out.println("Movie  " + catalog.toString() + " rented successfully at a discounted price.");
        }

        System.out.println("Movie  " + catalog.toString() + " rented successfully at a discounted price.");
    }


    public void rentMovie(BluRay bluRay, int bluRayId) {
        // Check if the provided BluRay object is null
        if (bluRay == null) {
            System.out.println("Invalid BluRay object. Rental failed.");
            return;
        }

        if (bluRay.isAvailable()) {
            bluRay.toggleAvailability();
            System.out.println("BluRay with ID " + bluRayId + " rented successfully.");
        } else {
            System.out.println("BluRay with ID " + bluRayId + " is not available for rental.");
        }
    }

}
