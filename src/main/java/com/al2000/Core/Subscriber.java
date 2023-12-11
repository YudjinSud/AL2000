package com.al2000.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subscriber extends User {
    private float solde;
    private int cardID;
    private boolean blocked;
    private List<String> restricted;
    private String pseudo;
    FacadeDataFct facadeDataFctInstance = new FacadeDataFct();


    public Subscriber(int userId, String creditCard, float solde, int cardID, boolean blocked,
                      List<String> restricted, String pseudo) {
        super(userId, creditCard);
        this.solde = solde;
        this.cardID = cardID;
        this.blocked = false;
        this.restricted = restricted;
        this.pseudo = pseudo;
    }

    public Subscriber (int id, String card, int solde) {
	super(id, card);
    }

    public float setSolde(float amount) {
        float newSolde = this.solde += amount;
        facadeDataFctInstance.setSolde(cardID, newSolde);
        return newSolde;
    }


    public float getSolde() {
        return solde;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public List<String> getRestricted() {
        return restricted;
    }

    public void setRestricted(List<String> restricted) {
        this.restricted = restricted;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    //@Override
    public void displayUserInfo() {
       // super.displayUserInfo(); 
        System.out.println("Solde: " + solde);
        System.out.println("Card ID: " + cardID);
        System.out.println("Blocked: " + blocked);
        System.out.println("Restricted: " + Arrays.toString(restricted.toArray()));
        System.out.println("Pseudo: " + pseudo);
    }
}
