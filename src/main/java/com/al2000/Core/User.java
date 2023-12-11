package com.al2000.Core;

public abstract class User {
    private int userId;
    private String creditCard;

    public User(int userId, String creditCard) {
        this.userId = userId;
        this.creditCard = creditCard;
    }


    // Getters and Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}