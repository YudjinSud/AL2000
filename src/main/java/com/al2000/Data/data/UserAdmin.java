package com.al2000.Data.data;


public class UserAdmin {

    private int userId;
    private int cardId;

    // Constructeur par défaut
    public UserAdmin() { }

    // Constructeur avec des paramètres
    public UserAdmin(int userId, int cardId) {
        this.userId = userId;
        this.cardId = cardId;
    }

    // Getters et setters pour les attributs
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public int getCardId() { return cardId; }
    public void setCreditCardId(int creditCardId) { this.cardId = creditCardId; }

    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return "UserAdmin [userId=" + userId +
                ", creditCardId=" + cardId + "]";
    }
}