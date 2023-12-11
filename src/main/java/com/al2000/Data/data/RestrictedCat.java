package com.al2000.Data.data;

public class RestrictedCat {
    private int userId;
    private int cardId;
    private String category;

    public RestrictedCat(){}

    public RestrictedCat(int userId, int cardId, String category)
    {
        this.userId = userId;
        this.cardId = cardId;
        this.category = category;
    }

    public void setUserId(int userId){ this.userId = userId; }
    public int getUserId(){ return userId; }
    public void setCardId(int cardId){ this.cardId = cardId; }
    public int getCardId(){ return cardId; }
    public void setCategory(String category){ this.category = category; }
    public String getCategory(){ return category; }

    @Override
    public String toString() { 
        return "RestrictedCat [" +
                "userId="+ userId +
                ", cardId=" + cardId+
                ", category=" + category + "]";
    }
}