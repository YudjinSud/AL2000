package com.al2000.Core;


public class Rent {
    private int userId;
    private int bluRayId;
    private int hourRental;
    private boolean ifSubscribed;


    public Rent(int userId, int bluRayId, int hourRental) {
        this.userId = userId;
        this.bluRayId = bluRayId;
        this.hourRental = hourRental;
        this.ifSubscribed = ifSubscribed;
    }


    public double getForfait() {
        double basePrice = 5.0;  // Default price for non-subscribed users
        double discountedPrice = 4.0;  // Price for subscribed users
    
        double actualPrice = ifSubscribed ? discountedPrice : basePrice;
        return actualPrice;
    }

    public void rentBluRay(Movie catalog) {
        //  update the BluRay's status, handle availability, etc.
        // Example: catalog.rentMovie(bluRayId);
        System.out.println("BluRay with ID " + bluRayId + " rented successfully.");
    }

    public void returnBluRay(Movie catalog) {
        // update the BluRay's status, handle late fees, etc.
        // Example: catalog.returnMovie(bluRayId);
        System.out.println("BluRay with ID " + bluRayId + " returned successfully.");
    }

    public void rentQRCode(Movie catalog) {

        System.out.println("BluRay with ID " + bluRayId + " rented using QR code.");
    }
}
