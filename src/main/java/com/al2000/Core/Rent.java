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
        this.ifSubscribed = true;
    }

    public Rent(int bluRayId, int hourRental) {
        Random random = new Random();
        this.userId = random.nextInt(1000000)
        this.bluRayId = bluRayId;
        this.hourRental = hourRental;
        this.ifSubscribed = false;
    }


    public double getForfait() {
        double basePrice = 5.0;  // Default price for non-subscribed users
        double discountedPrice = 4.0;  // Price for subscribed users
    
        double actualPrice = ifSubscribed ? discountedPrice : basePrice;
        return actualPrice;
    }

    public void rentBluRay(Movie catalog, Subscriber subscriber) {

        double actualPrice = getForfait();

        // Check if the BluRay with the given ID exists in the catalog
        BluRay bluRay = catalog.getMovieByBluRayId(bluRayId);
        if (bluRay == null) {
            System.out.println("No BluRay found with ID: " + bluRayId);
            return; 
        }

        if (ifSubscribed()) {
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

        if (ifSubscribed()) {
            float solde = subscriber.getSolde();

            if (solde >= actualPrice) {
                Random random = new Random();
                int QRcodeId = random.nextInt(1000000)
                System.out.println("Movie  " + Movie + " rented successfully at a discounted price.");
                // Deduct the actual price from the solde
                subscriber.setSolde(solde - actualPrice);
            } else {
                System.out.println("Insufficient solde to rent  " + Movie);
            }
        } else {
            // If the user is not subscribed, rent the BluRay at the regular price
            Random random = new Random();
            int QRcodeId = random.nextInt(1000000)
            System.out.println("Movie  " + Movie + " rented successfully at a discounted price.");
        }

        System.out.println("Movie  " + Movie + " rented successfully at a discounted price.");
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
