package com.al2000.Data.data;

import java.util.ArrayList;

public class User {

    private int userId;
    private int creditCardId;
    private int cardId;
    private String pseudo;
    private int balance;
    private ArrayList<String> movieCatRestricted;
    private boolean isAdmin;

    // Constructeur par défaut
    public User() {
    }

    // Constructeur avec des paramètres
    public User(int id, String nom, String prenom) {
        this.userId = id;

    }

    // Getters et setters pour les attributs
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public int getCreditCardId() { return creditCardId; }
    public void setCreditCardId(int creditCardId) { this.creditCardId = creditCardId; }
    public int getCardId() { return cardId; }
    public void setCardId(int cardId) { this.cardId = cardId; }
    public String getPseudo() { return pseudo; }
    public void setPseudo(String pseudo) { this.pseudo = pseudo; }
    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }
    public ArrayList<String> getMovieCatRestricted() { return movieCatRestricted; }
    public void setMovieCatRestricted(ArrayList<String> movieCatRestricted) { this.movieCatRestricted = movieCatRestricted; }
    public boolean isAdmin() { return isAdmin; }
    public void setAdmin(boolean admin) { isAdmin = admin; }

    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return "User [userId=" + userId +
                ", creditCardId=" + creditCardId +
                ", cardId=" + cardId +
                ", pseudo=" + pseudo +
                ", balance=" + balance +
                ", movieCatRestricted=" + movieCatRestricted +
                ", isAdmin=" + isAdmin + "]";
    }
}

