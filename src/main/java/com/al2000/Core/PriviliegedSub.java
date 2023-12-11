package com.al2000.Core;

import java.util.ArrayList;
import java.util.List;

public class PriviliegedSub extends Subscriber {
    private List<Subscriber> listCard;

    public PriviliegedSub(int userId, String creditCard, float solde, int cardID, boolean blocked,
                         List<String> restricted, String pseudo) {
        super(userId, creditCard, solde, cardID, blocked, restricted, pseudo);
        this.listCard = new ArrayList<>();
        // this.listCard.add(cardID);  // Add the initial card to the list
    }

    public void addRestrictedCategory(String cat, int cardId) {
        // Find the subscriber with the specified cardId
        Subscriber subscriber = findCardById(cardId);
        if (subscriber != null) {
            // FacadeDataFct.addRestrictedCat(cardId, cat);
            System.out.println("Restricted category '" + cat + "' added to card with ID " + cardId);
        } else {
            System.out.println("subscriber with cardID " + cardId + " not found.");
        }
    }

    public void removeRestrictedCategory(String cat, int cardId) {
        Subscriber subscriber = findCardById(cardId);
        if (subscriber != null) {
            //FacadeDataFct.delRestrictedCat(cardId, cat);
            System.out.println("Restricted category '" + cat + "' removed from card with ID " + cardId);
        } else {
            System.out.println("subscriber with cardID " + cardId + " not found.");
        }
    }

/*    public List<SubscriberHistory> getHistory(int cardId) {
        Subscriber subscriber = findCardById(cardId);
        if (subscriber != null) {
            return FacadeDataFct.getHistory(cardId);
        }
        System.out.println("subscriber with cardID " + cardId + " not found.");
        return new ArrayList<>();
    }
*/

    public void addBalance(int cardId, float amount) {
        Subscriber subscriber = null; // findCardById(cardId);
        if (subscriber != null) {
            // Add the balance to the specified card
            int newSolde = 0; // subscriber.setSolde(subscriber.getSolde() + amount);
            // FacadeDataFct.setSolde(cardId, newSolde);
            System.out.println("Balance added to card with ID " + cardId);
        } else {
            System.out.println("subscriber with cardID " + cardId + " not found.");
        }
    }

    public float getBalance(int cardId) {
        Subscriber subscriber = findCardById(cardId);
        if (subscriber != null) {
            // Return the balance of the specified card
            return subscriber.getSolde();
        } else {
            System.out.println("subscriber with ID " + cardId + " not found.");
            return 0.0f;
        }
    }

    public void createNewSubCard() {
        int newCardId;
        int userId;
    
        Subscriber newCard = new Subscriber(getUserId(), getCreditCard(), getSolde(), getCardID(),
                isBlocked(), new ArrayList<>(getRestricted()), getPseudo());
        newCardId = 0; // newCard.getCardID();
        userId = getUserId();
        // FacadeDataFct.addCard(userId, newCardId);
    
        System.out.println("New subscriber card created with ID " + newCardId);
    }

    // Helper method to find a subsciber by cardId
    private Subscriber findCardById(int cardId) {
        for (Subscriber subscriber : listCard) {
            if (subscriber.getCardID() == cardId) {
                return subscriber;
            }
        }
        return null;
    }
}
