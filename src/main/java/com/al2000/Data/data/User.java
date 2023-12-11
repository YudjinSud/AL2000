package com.al2000.Data.data;


public class User {

    private int userId;
    private int creditCardId;

    // Constructeur par défaut
    public User() { }

    // Constructeur avec des paramètres
    public User(int userId, int creditCardId) {
        this.userId = userId;
        this.creditCardId = creditCardId;
    }

    // Getters et setters pour les attributs
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public int getCreditCardId() { return creditCardId; }
    public void setCreditCardId(int creditCardId) { this.creditCardId = creditCardId; }

    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return "User [userId=" + userId +
                ", creditCardId=" + creditCardId + "]";
    }
}

